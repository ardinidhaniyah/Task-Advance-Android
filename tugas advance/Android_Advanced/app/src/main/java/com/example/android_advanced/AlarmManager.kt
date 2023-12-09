package com.example.android_advanced

import android.annotation.TargetApi
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import java.util.concurrent.TimeUnit
//import kotlinx.android.synthetic.main.activity_alarmmanager.*

class AlarmManager : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarmmanager)

//        val countDownTimer = object : CountDownTimer(6000, 1000) {
//            override fun onFinish() {
//                var message: String
//
//                // alarm berulang
//                message = "Alarm service dimulai"
//                startService(Intent(this@AlarmManager, AlarmService::class.java))
//
//                // alarm sekali jalan
//                message = "Alarm akan menyala dalam hitungan waktu mundur"
//                setScheduleNotification()
//
//                txt_counter.text = message
//            }
//
//            override fun onTick(millisUntilFinished: Long) {
//                txt_counter.text = TimeUnit.SECONDS.convert(millisUntilFinished / 1000, TimeUnit.SECONDS).toString()
//            }
//        }
//        countDownTimer.start()
//    }
//
//    @TargetApi(Build.VERSION_CODES.M)
//    fun setScheduleNotification() {
//
//        val intent = Intent(this@AlarmManager, AboutActivity::class.java)
//        intent.putExtra("key", "value")
//
//
//        val requestCode = 0
//        val pendingIntent =
//            PendingIntent.getActivity(this@AlarmManager, requestCode, intent, 0)
//
//
//        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
//
//        alarmManager.setExactAndAllowWhileIdle(
//            AlarmManager.RTC_WAKEUP,
//            System.currentTimeMillis() + 5000,
//            pendingIntent
//        )
    }
}