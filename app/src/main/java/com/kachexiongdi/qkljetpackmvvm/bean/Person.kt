package com.kachexiongdi.qkljetpackmvvm.bean

/**
 *   author : qiukailong
 *   date   : 2021/4/30  10:39 AM
 *   desc   :
 */
class Person(
    var name: String,
    val age: Int,
    val header: Int,
    var headerUrl: String
) {
    var enName: String = ""

    constructor(
        name: String,
        enName: String,
        headerUrl: String
    ) : this(name, 0, 0, headerUrl) {
        this.name = name
        this.enName = enName
        this.headerUrl = headerUrl
    }
}