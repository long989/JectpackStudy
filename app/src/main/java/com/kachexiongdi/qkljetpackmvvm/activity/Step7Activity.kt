package com.kachexiongdi.qkljetpackmvvm.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.kachexiongdi.qkljetpackmvvm.adapter.Step6Adapter
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityStepFifthBinding
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityStepSeventhBinding
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityStepSixthBinding
import com.kachexiongdi.qkljetpackmvvm.utils.PersonUtils
import com.kachexiongdi.qkljetpackmvvm.viewmodel.SeventhViewModel
import com.kachexiongdi.qkljetpackmvvm.viewmodel.UserViewModel

class Step7Activity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityStepSeventhBinding
    private lateinit var seventhViewModel: SeventhViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityStepSeventhBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        initView()
    }

    private fun initView() {
        seventhViewModel = ViewModelProvider(this).get(SeventhViewModel::class.java)
        viewBinding.seventhViewModel = seventhViewModel
        viewBinding.lifecycleOwner = this
    }
}