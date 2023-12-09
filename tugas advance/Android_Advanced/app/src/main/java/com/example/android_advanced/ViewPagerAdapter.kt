package com.example.android_advanced

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter (fm : FragmentManager) : FragmentPagerAdapter(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                KotlinFragment()
            }
            1 -> {
                ReactNativeFragment()
            }
            else -> {
                return FlutterFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> {
                "Home"
            }
            1 -> {
                "Activity"
            }
            else -> {
                "Story"
            }
        }
    }
}