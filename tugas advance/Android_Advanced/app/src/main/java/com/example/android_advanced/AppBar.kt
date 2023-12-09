package com.example.android_advanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AppBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_bar)
        hideActionBar()
    }

    private fun hideActionBar() {
        supportActionBar?.hide()
    }
}