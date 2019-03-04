package com.example.javarview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.Handler>{
    private Context context;
    private ArrayList<String> PL;

    public void dataInit()
    {
        PL.add("C#");
        PL.add("C++");
        PL.add("Java");
        PL.add("Kotlin");
        PL.add("JavaScript");
        PL.add("PHP 7.0");
    }

    public ListAdapter(Context context)
    {
        context = this.context;
    }

    @NonNull
    @Override
    public ListAdapter.Handler onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(content_rview, viewGroup, false);
        Handler handler = new Handler(view);
        return handler;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.Handler handler, int i) {

    }

    @Override
    public int getItemCount() {
        PL.size();
    }

    public class Handler extends RecyclerView.ViewHolder{
        public Handler(View views)
        {

        }
    }
}
