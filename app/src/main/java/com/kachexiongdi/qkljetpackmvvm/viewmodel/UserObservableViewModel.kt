package com.kachexiongdi.qkljetpackmvvm.viewmodel

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.kachexiongdi.qkljetpackmvvm.BR
import com.kachexiongdi.qkljetpackmvvm.bean.Person

/**
 *   author : qiukailong
 *   date   : 2021/5/6  3:20 PM
 *   desc   :
 */
class UserObservableViewModel(
    val person: Person = Person("刘德华", 60, -1, "")
) : BaseObservable() {

    fun setPersonName(name: String?) {
        if (name!= null && name != person.name){
            person.name = name
            Log.e("qkl", person.name)
            notifyPropertyChanged(BR.person)
        }
    }

    @Bindable
    fun getPersonName(): String {
        return person.name
    }
}