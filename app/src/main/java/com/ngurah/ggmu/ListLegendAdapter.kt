package com.ngurah.ggmu

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListLegendAdapter(private val listLegend: ArrayList<Legend>): RecyclerView.Adapter<ListLegendAdapter.ListViewHolder>()  {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }



    class ListViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        var tvPhoto:ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDeskripsi:TextView = itemView.findViewById(R.id.tv_item_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_ggmu, parent, false)
        return ListViewHolder(view)
    }



    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, photo, description) = listLegend[position]

        Glide.with(holder.itemView.context)
            // url Gambar
            .load(photo)
            .into(holder.tvPhoto)
        holder.tvName.text = name
        holder.tvDeskripsi.text = description
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listLegend[holder.adapterPosition])

        }
    }

        override fun getItemCount(): Int {
            return listLegend.size
        }

    interface OnItemClickCallback {
        fun onItemClicked(data: Legend)
    }
}


