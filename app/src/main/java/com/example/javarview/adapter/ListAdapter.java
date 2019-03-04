package com.example.javarview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.javarview.R;
import com.example.javarview.model.PLanguage;
import com.squareup.picasso.Picasso;

import java.util.Vector;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.Handler>{
    private Context context;
    private Vector<String> progLang;
    private Vector<String> imageUrl;

    public ListAdapter(Context context)
    {
        context = this.context;
    }

    public void dataInit()
    {
        PLanguage pLang = new PLanguage();
        progLang = pLang.getName();
        imageUrl = pLang.getImage();
    }

    @NonNull
    @Override
    public ListAdapter.Handler onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        dataInit();
        View view = LayoutInflater.from(context).inflate(R.layout.content_rview, viewGroup, false);
        Handler handler = new Handler(view);
        return handler;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.Handler handler, int i) {
        handler.txt.setText(progLang.get(i));

        Picasso.get().load(imageUrl.get(i))
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .into(handler.circleImg);
    }

    @Override
    public int getItemCount() {
        return progLang.size();
    }

    public class Handler extends RecyclerView.ViewHolder{
        CircleImageView circleImg;
        TextView txt;

        public Handler(@NonNull View views)
        {
            super(views);
            circleImg = views.findViewById(R.id.content_images);
            txt = views.findViewById(R.id.proglang);
        }
    }
}
