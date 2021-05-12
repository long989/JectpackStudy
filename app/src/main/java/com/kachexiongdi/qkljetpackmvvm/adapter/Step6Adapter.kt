package com.kachexiongdi.qkljetpackmvvm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.kachexiongdi.qkljetpackmvvm.R
import com.kachexiongdi.qkljetpackmvvm.bean.Person
import com.kachexiongdi.qkljetpackmvvm.databinding.ItemUserBinding

/**
 *   author : qiukailong
 *   date   : 2021/5/7  10:48 AM
 *   desc   :
 */
class Step6Adapter(dataList: MutableList<Person>) :
    RecyclerView.Adapter<Step6Adapter.Step6ViewHolder>() {

    private val mDataList: MutableList<Person> = dataList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Step6ViewHolder {
        val itemBinding = DataBindingUtil.inflate<ItemUserBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_user,
            null,
            false
        )
        return Step6ViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return mDataList.size
    }

    override fun onBindViewHolder(holder: Step6ViewHolder, position: Int) {
        holder.mItemBinding?.person = mDataList[position]
    }

    class Step6ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var mItemBinding: ItemUserBinding? = null

        constructor(itemBinding: ItemUserBinding) : this(itemBinding.root) {
            mItemBinding = itemBinding
        }
    }

}