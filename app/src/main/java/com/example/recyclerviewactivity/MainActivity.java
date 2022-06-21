package com.example.recyclerviewactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    LinearLayoutManager llayout;
    Adapter adapter;
    List<String> listdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rvdata);
        listdata = new ArrayList<>();

        for(int i=0; i<0; i++){
            listdata.add("data ke " + i);
        }

        llayout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(llayout);

        adapter = new Adapter(this, listdata);
        rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}