package com.cmh.lovetest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.custom_list_view.view.*

class DataRecycler(val profile:Int, val name:String)

class CustomViewHolder(v:View) : RecyclerView.ViewHolder(v){
    val profile = v.iv_custom
    val name = v.tv_custom
}

class CustomRecyclerAdapter(val dataList:ArrayList<DataRecycler> , val context:Context) : RecyclerView.Adapter<CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val cellForRow = LayoutInflater.from(parent.context).inflate(R.layout.custom_list_view, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.profile.setImageResource(dataList[position].profile)
        holder.name.setText(dataList[position].name)

        holder.itemView.setOnClickListener { v ->
//            Toast.makeText(v.context, dataList[position].name, Toast.LENGTH_SHORT).show()
            (context as RecyclerViewActivity).recyclerClick(dataList[position])
        }
    }

    override fun getItemCount(): Int  = dataList.size
}