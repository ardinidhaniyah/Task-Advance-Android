package com.example.android_advanced

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {

    private var timeOut: Long = 2400

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            val intent = Intent(this, Animation::class.java)
            startActivity(intent)
            finish()
        }, timeOut)
    }
}