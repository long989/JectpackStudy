package com.kachexiongdi.qkljetpackmvvm.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

/**
 *   author : qiukailong
 *   date   : 2021/5/7  6:00 PM
 *   desc   :
 */
@Entity
class Student @Ignore constructor(
    @ColumnInfo(name = "userName") var userName: String?,
    @ColumnInfo(name = "age") var age: Int?
) {
    @PrimaryKey
    var uid: Int? = 0

}