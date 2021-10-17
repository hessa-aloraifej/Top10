package com.example.top0

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.top0.Top10.Entries.Entry
import kotlinx.android.synthetic.main.item_row.view.*

class RVAdapter(private val top: List<Entry>?): RecyclerView.Adapter<RVAdapter.ItemViewHolder>() {
    class ItemViewHolder (itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val information=top!![position]

        holder.itemView.apply {
            textView.text= information.name



        }
    }

    override fun getItemCount() = top!!.size

}
