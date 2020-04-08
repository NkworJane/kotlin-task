package com.example.myshoppingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = GridLayoutManager(this@MainActivity,2)

        val infos = ArrayList<Info>()
            for(i in 0..100) {
                infos.add(Info("https://via.placeholder.com/150/ffff00/ff00ff","Speaker #$i",3.77))
            }


        val adapter = ItemsAdapter(infos)

        recyclerView.adapter = adapter

    }
}
