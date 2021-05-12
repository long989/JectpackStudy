package com.kachexiongdi.qkljetpackmvvm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kachexiongdi.qkljetpackmvvm.activity.*
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val rootView = binding.root
        setContentView(rootView)
        lifecycle.addObserver(binding.myText)
    }

    fun startStep1(view: View) {
        val intent = Intent(this, Step1Activity::class.java)
        intent.putExtra("type", "step1")
        startActivity(intent)
    }

    fun startStep2(view: View) {
        val intent = Intent(this, Step1Activity::class.java)
        intent.putExtra("type", "step2")
        startActivity(intent)
    }

    fun startStep3(view: View) {
        val intent = Intent(this, Step2Activity::class.java)
        intent.putExtra("type", "step4")
        startActivity(intent)
    }

    fun startStep4(view: View) {
        val intent = Intent(this, Step3Activity::class.java)
        intent.putExtra("type", "step4")
        startActivity(intent)
    }

    fun startStep5(view: View) {
        val intent = Intent(this, Step4Activity::class.java)
        intent.putExtra("type", "step5")
        startActivity(intent)
    }

    fun startStep6(view: View) {
        val intent = Intent(this, Step5Activity::class.java)
        intent.putExtra("type", "step6")
        startActivity(intent)
    }

    fun startStep7(view: View) {
        val intent = Intent(this, Step6Activity::class.java)
        intent.putExtra("type", "step6")
        startActivity(intent)
    }

    fun startStep8(view: View) {
        val intent = Intent(this, Step7Activity::class.java)
        intent.putExtra("type", "step6")
        startActivity(intent)
    }

    fun startStep9(view: View) {
        val intent = Intent(this, Step8Activity::class.java)
        intent.putExtra("type", "step6")
        startActivity(intent)
    }
}