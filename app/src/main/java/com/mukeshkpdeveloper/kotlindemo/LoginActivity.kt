package com.mukeshkpdeveloper.kotlindemo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mikhaellopez.circularimageview.CircularImageView
import com.mukeshkpdeveloper.kotlindemo.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var mContext : Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        mContext = this

        binding.ivProceed.setOnClickListener() {
            startActivity(Intent(this, DashBoardActivity::class.java))
        }
    }
}