package com.example.au_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.bumptech.glide.Glide
import com.example.au_test.databinding.ActivityNoneBinding
import com.example.au_test.databinding.ActivityTimetoplayBinding

class NoneActivity : AppCompatActivity() {
    lateinit var binding: ActivityNoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Glide.with(this).load("https://polinka.top/uploads/posts/2023-06/1686865870_polinka-top-p-korporatsiya-monstrov-personazhi-kartinki-45.jpg").into(binding.imageViewNone)
        val timer = object: CountDownTimer(2000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                startActivity(Intent(this@NoneActivity, Timetoplay::class.java))
            }
        }
        timer.start()
    }
}