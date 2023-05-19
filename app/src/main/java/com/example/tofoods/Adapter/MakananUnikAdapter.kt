package com.example.tofoods.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tofoods.R

class MakananUnikAdapter: RecyclerView.Adapter<MakananUnikAdapter.MakananUnikViewHolder>() {
    class MakananUnikViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananUnikViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.makanan_list_item, parent, false)
        return MakananUnikViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: MakananUnikViewHolder, position: Int) {

    }
}