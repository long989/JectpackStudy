package com.kachexiongdi.qkljetpackmvvm.activity

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import com.kachexiongdi.qkljetpackmvvm.R
import com.kachexiongdi.qkljetpackmvvm.adapter.Step6Adapter
import com.kachexiongdi.qkljetpackmvvm.databinding.*
import com.kachexiongdi.qkljetpackmvvm.utils.PersonUtils
import com.kachexiongdi.qkljetpackmvvm.viewmodel.SeventhViewModel
import com.kachexiongdi.qkljetpackmvvm.viewmodel.UserViewModel

class Step10Activity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityStepTenthBinding
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityStepTenthBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        initView()
    }

    private fun initView() {
        navController = Navigation.findNavController(this, R.id.fragment)
        appBarConfiguration = AppBarConfiguration.Builder(navController.graph).build()
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
        //页面切换监听
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            Log.e("qkl----->", "addOnDestinationChangedListener")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(
            item,
            navController
        ) or super.onOptionsItemSelected(item)
    }

    //这个方法的作用就是从A页面跳转到B页面，B页面点击返回按钮时回退到A页面
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(
            navController,
            appBarConfiguration
        ) or super.onSupportNavigateUp()
    }
}