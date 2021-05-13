package com.kachexiongdi.qkljetpackmvvm.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kachexiongdi.qkljetpackmvvm.databinding.FragmentStep9DetailBinding
import com.kachexiongdi.qkljetpackmvvm.databinding.FragmentStep9HomeBinding

/**
 *   author : qiukailong
 *   date   : 2021/5/12  6:30 下午
 *   desc   :
 */
class Step9DetailFragment :Fragment(){
    private lateinit var viewBinding: FragmentStep9DetailBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentStep9DetailBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewBinding.button1.setOnClickListener {

        }
    }
}