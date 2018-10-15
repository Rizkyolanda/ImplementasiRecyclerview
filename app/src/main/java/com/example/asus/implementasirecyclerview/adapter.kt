package com.example.asus.implementasirecyclerview

import android.content.Context
import android.graphics.ColorSpace
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class Adapter(mContext: Context, val listData : List<ColorSpace.Model> ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(p0?.context).inflate(R.layout.list_item, p0, false)
        return RecyclerView.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, i: Int) {
        val model: ColorSpace.Model = listData.get(i)

        viewHolder.icon.setText(model.icon)
        viewHolder.test.setText(model.test)
    }

}