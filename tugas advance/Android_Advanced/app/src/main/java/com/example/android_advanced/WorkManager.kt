package com.example.android_advanced

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_advanced.activity.WorkerActivity
import com.example.android_advanced.activity.WorkerCoroActivity

class WorkManager : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workmanager)

//        btn_normal.setOnClickListener {
//            startActivity(
//                Intent(
//                    this,
//                    WorkerActivity::class.java
//                )
//            )
//        }
//        btn_coroutines.setOnClickListener {
//            startActivity(
//                Intent(
//                    this,
//                    WorkerCoroActivity::class.java
//                )
//            )
//        }
    }
}