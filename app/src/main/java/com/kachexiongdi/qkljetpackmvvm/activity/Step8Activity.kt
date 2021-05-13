package com.kachexiongdi.qkljetpackmvvm.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.kachexiongdi.qkljetpackmvvm.adapter.Step8Adapter
import com.kachexiongdi.qkljetpackmvvm.databinding.ActivityStepEighthBinding
import com.kachexiongdi.qkljetpackmvvm.db.Student
import kotlinx.coroutines.launch

class Step8Activity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityStepEighthBinding
//    private lateinit var studentDao: StudentDao
    private lateinit var adapter: Step8Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityStepEighthBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        initView()
    }

    private fun initView() {
//        val database = StudentDatabase2.getInstance(this)
//        studentDao =   database.studentDao
//        viewBinding.recyclerView.layoutManager = LinearLayoutManager(this)
//        adapter = Step8Adapter()
//        viewBinding.recyclerView.adapter = adapter
    }

    fun query(view: View) {
        lifecycleScope.launch {
//            val students = studentDao.getStudents()
//            adapter.setDataList(students)
        }
    }

    fun insert(view: View) {
        val student = Student("鲁班", 10)
        lifecycleScope.launch {
//            studentDao.insertStudents(student)
        }
    }

    fun delete(view: View) {

    }
    fun update(view: View) {

    }
}