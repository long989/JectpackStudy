package com.kachexiongdi.qkljetpackmvvm.activity

import android.os.Bundle
import com.kachexiongdi.qkljetpackmvvm.BaseActivity
import com.kachexiongdi.qkljetpackmvvm.R
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityStepFirstBinding
import com.kachexiongdi.qkljetpackmvvm.fragment.Step1Fragment
import com.kachexiongdi.qkljetpackmvvm.fragment.Step2Fragment

class Step1Activity : BaseActivity<ActivityStepFirstBinding>() {
    private val type: String? by lazy {
        intent.getStringExtra("type")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        when (type) {
            "step1" -> {
                transaction.replace(R.id.fragment, Step1Fragment.newInstance())
            }
            "step2" -> {
                transaction.replace(R.id.fragment, Step2Fragment.newInstance())
            }
        }
        transaction.commit()
    }
}