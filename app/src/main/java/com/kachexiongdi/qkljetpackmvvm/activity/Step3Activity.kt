package com.kachexiongdi.qkljetpackmvvm.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kachexiongdi.qkljetpackmvvm.R
import com.kachexiongdi.qkljetpackmvvm.bean.Person
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityStepThirdBinding
import com.kachexiongdi.qkljetpackmvvm.handle.EventHandleListener

class Step3Activity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityStepThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityStepThirdBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        initView()
    }

    private fun initView() {
        val person = Person(
            "高圆圆", 40, R.drawable.gaoyuanyuan2,
            "https://upload-images.jianshu.io/upload_images/8643820-fbdaabbe560b9892.png?imageMogr2/auto-orient/strip|imageView2/2/w/476/format/webp"
        )
        viewBinding.person = person
        viewBinding.eventHandle = EventHandleListener(this)
    }
}