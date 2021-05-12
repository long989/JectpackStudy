package com.kachexiongdi.qkljetpackmvvm.location

import android.util.Log
import androidx.lifecycle.LifecycleService

/**
 *   author : qiukailong
 *   date   : 2021/4/29  4:11 PM
 *   desc   :
 */
public class MyLocationService : LifecycleService() {

    init {
        Log.e("qkl","MyLocationService")
        val myLocationObserver = MyLocationObserver(this)
        lifecycle.addObserver(myLocationObserver)
    }
}