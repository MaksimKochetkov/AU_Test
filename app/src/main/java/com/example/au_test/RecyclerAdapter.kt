package com.example.au_test

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class RecyclerAdapter(val con: Context, val list2:ArrayList<RecyclerDataclass>): RecyclerView.Adapter<RecyclerAdapter.Link>() {
    class Link(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val im_di: ImageView = itemView.findViewById(R.id.imageView3)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Link {
        val root = LayoutInflater.from(con).inflate(R.layout.card, parent, false)
        return Link(root)
    }
    override fun onBindViewHolder(holder: Link, position: Int) {
        Glide.with(holder.itemView.context).load(list2[position].photo).centerCrop().into(holder.im_di)
    }

    override fun getItemCount(): Int {
        return list2.size
    }
}
