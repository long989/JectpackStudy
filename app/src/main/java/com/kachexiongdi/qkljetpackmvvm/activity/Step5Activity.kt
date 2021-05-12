package com.kachexiongdi.qkljetpackmvvm.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityStepFifthBinding
import com.kachexiongdi.qkljetpackmvvm.viewmodel.UserViewModel

class Step5Activity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityStepFifthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityStepFifthBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        initView()
    }

    private fun initView() {
        viewBinding.userViewModel = UserViewModel()
    }
}