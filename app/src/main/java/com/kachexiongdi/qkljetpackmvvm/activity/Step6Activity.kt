package com.kachexiongdi.qkljetpackmvvm.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.kachexiongdi.qkljetpackmvvm.adapter.Step6Adapter
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityStepFifthBinding
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityStepSixthBinding
import com.kachexiongdi.qkljetpackmvvm.utils.PersonUtils
import com.kachexiongdi.qkljetpackmvvm.viewmodel.UserViewModel

class Step6Activity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityStepSixthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityStepSixthBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        initView()
    }

    private fun initView() {
        viewBinding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = Step6Adapter(PersonUtils.get())
        viewBinding.recyclerView.adapter = adapter
    }
}