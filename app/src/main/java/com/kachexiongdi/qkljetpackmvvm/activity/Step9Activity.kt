package com.kachexiongdi.qkljetpackmvvm.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import com.kachexiongdi.qkljetpackmvvm.R
import com.kachexiongdi.qkljetpackmvvm.adapter.Step6Adapter
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityStepFifthBinding
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityStepNinthBinding
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityStepSeventhBinding
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityStepSixthBinding
import com.kachexiongdi.qkljetpackmvvm.utils.PersonUtils
import com.kachexiongdi.qkljetpackmvvm.viewmodel.SeventhViewModel
import com.kachexiongdi.qkljetpackmvvm.viewmodel.UserViewModel

class Step9Activity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityStepNinthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityStepNinthBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        initView()
    }

    private fun initView() {
        val navController = Navigation.findNavController(this, R.id.fragment)
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = Navigation.findNavController(this, R.id.fragment)
        return navController.navigateUp()
    }
}