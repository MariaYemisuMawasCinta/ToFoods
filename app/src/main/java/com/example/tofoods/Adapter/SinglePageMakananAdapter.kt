package com.example.tofoods.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tofoods.R
import com.google.android.material.bottomsheet.BottomSheetDialog

class SinglePageMakananAdapter: RecyclerView.Adapter<SinglePageMakananAdapter.SingleMakananViewHolder>() {
    class SingleMakananViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val btnMakanan = itemView.findViewById<View>(R.id.cv_detail_makanan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingleMakananViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.detail_makanan_item, parent, false)
        return SingleMakananViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: SingleMakananViewHolder, position: Int) {
        holder.btnMakanan.setOnClickListener {
            // buatkan view untuk bottom sheet dialog
            val view = LayoutInflater.from(holder.itemView.context).inflate(R.layout.sheet_pemesanan, null)
            // buatkan bottom sheet dialog
            val bottomSheetDialog = BottomSheetDialog(holder.itemView.context)
            // set view untuk bottom sheet dialog
            bottomSheetDialog.setContentView(view)
            // tampilkan bottom sheet dialog
            bottomSheetDialog.show()
        }
    }
}