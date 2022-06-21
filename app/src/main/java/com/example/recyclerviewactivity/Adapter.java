package com.example.recyclerviewactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    List<String> listdata;
    LayoutInflater inflater;

    public Adapter(Context context, List<String> listdata) {
        this.listdata = listdata;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_data, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.Holder holder, int position) {
        holder.txtdata.setText(listdata.get(position));
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class Holder extends RecyclerView.ViewHolder{

        TextView txtdata;
        public Holder(@NonNull View itemView) {
            super(itemView);

            txtdata = itemView.findViewById(R.id.datatext);
        }
    }
}
