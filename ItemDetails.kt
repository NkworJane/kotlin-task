package com.example.myshoppingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.item_details.*

class ItemDetails : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_details)
        val title = intent.getStringExtra("title")
        item_details.text = title
    }




}
