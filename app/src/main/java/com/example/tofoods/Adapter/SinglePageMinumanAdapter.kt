package com.example.tofoods.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tofoods.R

class SinglePageMinumanAdapter:  RecyclerView.Adapter<SinglePageMinumanAdapter.SingleMinumanViewHolder>() {
    class SingleMinumanViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val btnMinuman = itemView.findViewById<View>(R.id.ll_detail_minuman)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingleMinumanViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.detail_minuman_item, parent, false)
        return SingleMinumanViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 6
    }

    override fun onBindViewHolder(holder: SingleMinumanViewHolder, position: Int) {
        holder.btnMinuman.setOnClickListener {
            // buatkan view untuk bottom sheet dialog
            val view = LayoutInflater.from(holder.itemView.context).inflate(R.layout.sheet_pemesanan, null)
            // buatkan bottom sheet dialog
            val bottomSheetDialog = com.google.android.material.bottomsheet.BottomSheetDialog(holder.itemView.context)
            // set view untuk bottom sheet dialog
            bottomSheetDialog.setContentView(view)
            // tampilkan bottom sheet dialog
            bottomSheetDialog.show()
        }
    }
}