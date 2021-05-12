package com.kachexiongdi.qkljetpackmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 *   author : qiukailong
 *   date   : 2021/4/29  6:16 PM
 *   desc   :
 */
class SeekBarViewModel :ViewModel(){
    val mSbLiveData : MutableLiveData<Int> = MutableLiveData()
}