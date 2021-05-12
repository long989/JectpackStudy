package com.kachexiongdi.qkljetpackmvvm.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kachexiongdi.qkljetpackmvvm.R
import com.kachexiongdi.qkljetpackmvvm.bean.Person
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityStepFourthBinding
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityStepThirdBinding
import com.kachexiongdi.qkljetpackmvvm.handle.EventHandleListener
import com.kachexiongdi.qkljetpackmvvm.viewmodel.UserObservableViewModel

class Step4Activity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityStepFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityStepFourthBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        initView()
    }

    private fun initView() {
        viewBinding.userViewModel = UserObservableViewModel()
    }
}