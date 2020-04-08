package com.example.myshoppingapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ItemsAdapter(val infoList: ArrayList<Info>) : RecyclerView.Adapter<ItemsAdapter.ViewHolder>() {

    class ViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
        val imageView =itemView.findViewById(R.id.photoUrl) as ImageView
        val textViewName =itemView.findViewById(R.id.textView_name) as TextView
        val textViewPrice = itemView.findViewById(R.id.textView_price) as TextView
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.view_layout, parent, false)
        val holder = ViewHolder(v)
        v.setOnClickListener{
            val intent = Intent(parent.context,ItemDetails::class.java)
            intent.putExtra("title", infoList[holder.adapterPosition].price)
            parent.context.startActivity(intent)
            
        }
        return holder

    }

    override fun getItemCount(): Int {
        return infoList.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val info : Info =infoList [position]

        Picasso.get().load(infoList[position].photoUrl).into(holder?.imageView)
        holder?.textViewName?.text = info.name
        holder?.textViewPrice?.text = info.price.toString()


    }
}