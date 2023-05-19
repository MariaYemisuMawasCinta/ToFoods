package com.example.tofoods.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tofoods.R
import com.example.tofoods.SingleWarungActivity

class CategoryAdapter: RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
    class CategoryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val btnWarung = itemView.findViewById<View>(R.id.cv_warung)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_item_list, parent, false)
        return CategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 6
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.btnWarung.setOnClickListener {
            val intent = Intent(holder.itemView.context, SingleWarungActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }
}
