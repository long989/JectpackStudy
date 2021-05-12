package com.kachexiongdi.qkljetpackmvvm.handle

import android.content.Context
import android.view.View
import android.widget.Toast

/**
 *   author : qiukailong
 *   date   : 2021/4/30  3:50 PM
 *   desc   :
 */
class EventHandleListener(context: Context) {
    private val mContext: Context = context
    fun buttonOnClick(view: View) {
        Toast.makeText(mContext, "喜欢", Toast.LENGTH_LONG).show()
    }

}