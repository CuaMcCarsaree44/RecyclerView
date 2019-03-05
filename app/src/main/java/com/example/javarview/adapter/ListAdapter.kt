package com.example.javarview.adapter

import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.net.Uri

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.example.javarview.R
import com.example.javarview.model.PLanguage
import com.squareup.picasso.Picasso

import java.util.Vector

import de.hdodenhof.circleimageview.CircleImageView

class ListAdapter(private val context: Context) : RecyclerView.Adapter<ListAdapter.Handler>() {
    private var progLang = Vector<String>()
    private var imageUrl = Vector<String>()

    fun dataInit() {
        val pLang = PLanguage()
        progLang = pLang.name
        imageUrl = pLang.image
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListAdapter.Handler {
        val view = LayoutInflater.from(context).inflate(R.layout.content_rview, viewGroup, false)
        val handler = Handler(view)
        return handler
    }

    override fun onBindViewHolder(handler: ListAdapter.Handler, i: Int) {
        handler.txt.text = progLang[i]
        val resID = context.resources.getIdentifier(imageUrl[i],
                "drawable", context.packageName)


        Picasso.get().load(resID)
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_black)
                .into(handler.circleImg)

    }

    override fun getItemCount(): Int {
        return progLang.size
    }

    inner class Handler(views: View) : RecyclerView.ViewHolder(views) {
        internal var circleImg: CircleImageView
        internal var txt: TextView

        init {
            circleImg = views.findViewById(R.id.content_images)
            txt = views.findViewById(R.id.proglang)
        }
    }
}
