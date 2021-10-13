package com.mukeshkpdeveloper.kotlindemo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import com.mukeshkpdeveloper.kotlindemo.databinding.ActivitySplashBinding
import java.text.SimpleDateFormat
import java.util.*

class SplashActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding
    private lateinit var mContext : Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        mContext = this

        val hyperspaceJump: Animation =
            AnimationUtils.loadAnimation(this, R.anim.zoom_out_animation_splash)
        binding.mainLayout.startAnimation(hyperspaceJump)

        Handler().postDelayed({
            binding.tvTitleEng.visibility = View.VISIBLE
            binding.tvTitleArb.visibility = View.VISIBLE
            val hyperspaceJump: Animation =
                AnimationUtils.loadAnimation(this, R.anim.fadein)
            binding.tvTitleEng.startAnimation(hyperspaceJump)
            binding.tvTitleArb.startAnimation(hyperspaceJump)
        }, 1000)
        splash()

    }

    private fun splash() {
            Handler().postDelayed({

                    startActivity(Intent(this, LoginActivity::class.java))
                    finish()

            }, 3000)
    }
}