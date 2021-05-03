package com.eucalyptus.deeplinknavigation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eucalyptus.deeplinknavigation.Item
import com.eucalyptus.deeplinknavigation.databinding.ItemRowBinding

class ItemAdapter(private val context: Context, val itemList:ArrayList<Item>, val onButtonClick: (position: Int) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    inner class ItemViewHolder(viewBinding: ItemRowBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bindItem(data: Item) {
            itemList[adapterPosition]


        }

        init {
            viewBinding.addCartBtn.setOnClickListener {
                onButtonClick(adapterPosition)
            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val vieBinding = ItemRowBinding.inflate(LayoutInflater.from(context), parent, false)
        return ItemViewHolder(vieBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemHolder = holder as ItemViewHolder
        itemHolder.bindItem(itemList[position])

        /*if (getItemViewType(position) == LAYOUT_RIGHT) {
            val rightView = holder as MessageRightViewHolder
            rightView.bind(list[position])
        } else {

            val leftView = holder as MessageLeftViewHolder
            leftView.bind(list[position])
        }*/
    }

    override fun getItemCount(): Int {
       return itemList.size
    }
}