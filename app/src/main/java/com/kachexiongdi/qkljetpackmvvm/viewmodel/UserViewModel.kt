package com.kachexiongdi.qkljetpackmvvm.viewmodel

import androidx.databinding.ObservableField
import com.kachexiongdi.qkljetpackmvvm.bean.Person

/**
 *   author : qiukailong
 *   date   : 2021/5/6  5:08 PM
 *   desc   :
 */
class UserViewModel {
    private var observable: ObservableField<Person> = ObservableField()

    init {
        val person = Person("刘德华", 60, -1, "")
        observable.set(person)
    }

    fun setPersonName(name: String) {
        observable.get()?.name = name
    }

    fun getPersonName(): String {
        return observable.get()!!.name
    }

}