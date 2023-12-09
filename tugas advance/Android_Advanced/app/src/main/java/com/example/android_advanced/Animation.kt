package com.example.android_advanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import kotlinx.android.synthetic.main.activity_animation.*

class Animation : AppCompatActivity() {

    private var isCheckedDone: Boolean = false
    private var isSwitchDone: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

//        lottieAnimationView3.setOnClickListener{
//            if (isCheckedDone){
//                lottieAnimationView3.speed = -1F
//                lottieAnimationView3.playAnimation()
//                isCheckedDone = false
//            } else{
//                lottieAnimationView3.speed = 1F
//                lottieAnimationView3.playAnimation()
//                isCheckedDone = true
//            }
//        }
//
//        lottieAnimationView4.setOnClickListener{
//            if (isSwitchDone){
//                lottieAnimationView4.setMinAndMaxProgress(0.5f, 1f)
//                lottieAnimationView4.playAnimation()
//                isSwitchDone = false
//            } else {
//                lottieAnimationView4.setMinAndMaxProgress(0f, 0.5f)
//                lottieAnimationView4.playAnimation()
//                isSwitchDone = true
//            }
//        }
    }
}