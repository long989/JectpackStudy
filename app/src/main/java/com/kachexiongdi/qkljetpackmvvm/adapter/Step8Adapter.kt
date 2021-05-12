package com.kachexiongdi.qkljetpackmvvm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.kachexiongdi.qkljetpackmvvm.R
import com.kachexiongdi.qkljetpackmvvm.databinding.ItemBinding
import com.kachexiongdi.qkljetpackmvvm.db.Student

/**
 *   author : qiukailong
 *   date   : 2021/5/10  5:28 PM
 *   desc   :
 */
class Step8Adapter :
    RecyclerView.Adapter<Step8Adapter.Step8ViewHolder>() {
    private var mDataList: MutableList<Student> = arrayListOf()

    fun setDataList(dataList: MutableList<Student>) {
        mDataList = dataList
        notifyDataSetChanged()
    }

    class Step8ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mItemBinding: ItemBinding? = null

        constructor(itemBinding: ItemBinding) : this(itemBinding.root) {
            mItemBinding = itemBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Step8ViewHolder {
        val itemBinding = DataBindingUtil.inflate<ItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item,
            null,
            false
        )
        return Step8ViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return mDataList.size
    }

    override fun onBindViewHolder(holder: Step8ViewHolder, position: Int) {
        holder.mItemBinding?.student = mDataList[position]
    }
}