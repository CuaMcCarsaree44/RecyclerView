package com.example.javarview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

import com.example.javarview.adapter.ListAdapter

class MainActivity : AppCompatActivity() {
    private val adapter = ListAdapter(this@MainActivity)
    private var RView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        title = "First Project"
        adapter.dataInit()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RView = findViewById(R.id.recyclerView1)

        RView!!.layoutManager = LinearLayoutManager(this)

        RView!!.adapter = adapter

    }
}
