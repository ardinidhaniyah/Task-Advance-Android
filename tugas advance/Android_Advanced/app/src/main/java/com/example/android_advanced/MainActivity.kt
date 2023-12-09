package com.example.android_advanced

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRecyclerView = findViewById<Button>(R.id.buttonRecyclerView)
        buttonRecyclerView.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, RecyclerView :: class.java)
            startActivity(intent)
        })

        val buttonAppBar = findViewById<Button>(R.id.buttonAppBar)
        buttonAppBar.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, AppBar :: class.java)
            startActivity(intent)
        })

        val buttonNavigationDrawer = findViewById<Button>(R.id.buttonNavigationDrawer)
        buttonNavigationDrawer.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, NavigationDrawer :: class.java)
            startActivity(intent)
        })

        val buttonBottomNavigation = findViewById<Button>(R.id.buttonBottomNavigation)
        buttonBottomNavigation.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, BottomNavigation :: class.java)
            startActivity(intent)
        })

        val buttonTabLayout = findViewById<Button>(R.id.buttonTabLayout)
        buttonTabLayout.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, TabLayout :: class.java)
            startActivity(intent)
        })

        val buttonViewModel = findViewById<Button>(R.id.buttonViewModel)
        buttonViewModel.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, ViewModel :: class.java)
            startActivity(intent)
        })

        val buttonSharedPreference = findViewById<Button>(R.id.buttonSharedPreference)
        buttonSharedPreference.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, SharedPreference :: class.java)
            startActivity(intent)
        })

        val buttonAnimation = findViewById<Button>(R.id.buttonAnimation)
        buttonAnimation.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, Animation :: class.java)
            startActivity(intent)
        })

        val buttonBrainTrainerApps = findViewById<Button>(R.id.buttonBrainTrainerApps)
        buttonBrainTrainerApps.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, BrainTrainerApps :: class.java)
            startActivity(intent)
        })

        val buttonRoom = findViewById<Button>(R.id.buttonRoom)
        buttonRoom.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, Room :: class.java)
            startActivity(intent)
        })

        val buttonAlarmManager = findViewById<Button>(R.id.buttonAlarmManager)
        buttonAlarmManager.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, AlarmManager :: class.java)
            startActivity(intent)
        })

        val buttonWorkManager = findViewById<Button>(R.id.buttonWorkManager)
        buttonWorkManager.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, WorkManager :: class.java)
            startActivity(intent)
        })

        val buttonRetrofit = findViewById<Button>(R.id.buttonRetrofit)
        buttonRetrofit.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, Retrofit :: class.java)
            startActivity(intent)
        })
    }
}