package com.example.android_advanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class TabLayout : AppCompatActivity() {
    private lateinit var tlTutorial: TabLayout
    private lateinit var vpTutorial: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablayout)

        init()
        setupViewPager()
    }

    private fun init() {
        tlTutorial = findViewById(R.id.tl_tutorial)
        vpTutorial = findViewById(R.id.vp_tutorial)
    }

    private fun setupViewPager(){
        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        vpTutorial.adapter = viewPagerAdapter
        tlTutorial.setupWithViewPager(vpTutorial)
    }
}