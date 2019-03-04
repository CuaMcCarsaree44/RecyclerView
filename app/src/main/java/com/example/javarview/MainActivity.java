package com.example.javarview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.javarview.adapter.ListAdapter;

public class MainActivity extends AppCompatActivity {
    private ListAdapter adapter = new ListAdapter(MainActivity.this);
    private RecyclerView RView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("First Project");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RView = findViewById(R.id.recyclerView1);

        RView.setLayoutManager(new LinearLayoutManager(this));
        adapter.dataInit();
        RView.setAdapter(adapter);

    }
}
