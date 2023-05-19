package com.example.tofoods.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tofoods.R

class MakananAdapter: RecyclerView.Adapter<MakananAdapter.MakananViewHolder>() {
    class MakananViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.makanan_list_item, parent, false)
        return MakananViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: MakananViewHolder, position: Int) {

    }

}