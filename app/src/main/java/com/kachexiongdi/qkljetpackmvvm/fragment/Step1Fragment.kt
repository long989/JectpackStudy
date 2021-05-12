package com.kachexiongdi.qkljetpackmvvm.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kachexiongdi.qkljetpackmvvm.BaseFragment
import com.kachexiongdi.qkljetpackmvvm.databinding.FragmentStepBinding

/**
 *   author : qiukailong
 *   date   : 2021/4/29  11:01 AM
 *   desc   :
 */
class Step1Fragment : Fragment() {
    private lateinit var viewBinding: FragmentStepBinding

    companion object {
        fun newInstance(): Step1Fragment {
            val fragment = Step1Fragment()
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentStepBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.myText.text = "Step1Fragment"
        lifecycle.addObserver(viewBinding.myText)
    }
}