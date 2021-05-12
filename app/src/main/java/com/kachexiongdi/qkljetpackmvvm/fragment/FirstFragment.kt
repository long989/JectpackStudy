package com.kachexiongdi.qkljetpackmvvm.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kachexiongdi.qkljetpackmvvm.R
import com.kachexiongdi.qkljetpackmvvm.databinding.FragmentFirstBinding
import com.kachexiongdi.qkljetpackmvvm.databinding.FragmentStepBinding
import com.kachexiongdi.qkljetpackmvvm.viewmodel.SeekBarViewModel

class FirstFragment : Fragment() {

    private lateinit var viewBinding: FragmentFirstBinding
    private lateinit var mSeekBarViewModel: SeekBarViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentFirstBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mSeekBarViewModel = ViewModelProvider(
            activity!!.viewModelStore,
            ViewModelProvider.AndroidViewModelFactory.getInstance(activity!!.application)
        ).get(SeekBarViewModel::class.java)
        viewBinding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                mSeekBarViewModel.mSbLiveData.value = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })

        mSeekBarViewModel.mSbLiveData.observe(activity!!, Observer<Int> {
            viewBinding.seekBar.progress = it
        })
    }
}