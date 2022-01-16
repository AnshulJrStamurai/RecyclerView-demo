package com.example.rv_demo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rv_demo.databinding.ItemBinding

class RVAdapter(private val mList: List<ItemModel>): RecyclerView.Adapter<RVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {
        holder.bind(mList[position])
    }

    override fun getItemCount() = mList.size

    inner class ViewHolder(private val binding: ItemBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(item: ItemModel){
            binding.itemImage.setImageResource(item.image)
            binding.itemLabel.text = item.text
        }
    }
}