package com.kachexiongdi.qkljetpackmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 *   author : qiukailong
 *   date   : 2021/5/7  3:05 PM
 *   desc   :
 */
class SeventhViewModel : ViewModel() {
    var aScoreLiveData: MutableLiveData<Int> = MutableLiveData()
    var bScoreLiveData: MutableLiveData<Int> = MutableLiveData()
    var aLastScore: Int = 0
    var bLastScore: Int = 0
    fun addAScore(i: Int) {
        saveLastScore()
        aScoreLiveData.value = aScoreLiveData.value?.plus(i)
    }

    fun addBScore(i: Int) {
        saveLastScore()
        bScoreLiveData.value = bScoreLiveData.value?.plus(i)
    }

    //重置
    fun resetValue() {
        aScoreLiveData.value = 0
        bScoreLiveData.value = 0
    }

    //撤销
    fun undo() {
        aScoreLiveData.value = aLastScore
        bScoreLiveData.value = bLastScore
    }

    //保存最后一次的值
    private fun saveLastScore() {
        if (aScoreLiveData.value == null){
            aScoreLiveData.value = 0
        }
        aLastScore = aScoreLiveData.value!!
        if (bScoreLiveData.value == null){
            bScoreLiveData.value = 0
        }
        bLastScore = bScoreLiveData.value!!
    }
}