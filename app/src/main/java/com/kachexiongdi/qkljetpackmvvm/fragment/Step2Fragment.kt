package com.kachexiongdi.qkljetpackmvvm.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kachexiongdi.qkljetpackmvvm.BaseFragment
import com.kachexiongdi.qkljetpackmvvm.databinding.FragmentStep2Binding
import com.kachexiongdi.qkljetpackmvvm.databinding.FragmentStepBinding
import com.kachexiongdi.qkljetpackmvvm.location.MyLocationService

/**
 *   author : qiukailong
 *   date   : 2021/4/29  11:01 AM
 *   desc   :
 */
class Step2Fragment : Fragment() {
    private lateinit var viewBinding: FragmentStep2Binding

    companion object {
        fun newInstance(): Step2Fragment {
            val fragment = Step2Fragment()
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentStep2Binding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        viewBinding.start.setOnClickListener {
         activity?.startService(Intent(activity,MyLocationService::class.java))
        }
        viewBinding.stop.setOnClickListener {
            activity?.stopService(Intent(activity,MyLocationService::class.java))
        }
    }
}