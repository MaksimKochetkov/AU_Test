package com.example.au_test

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.au_test.databinding.ActivityMainBinding
import java.util.Timer
var right_answers = 0
var name = ""
var first_time = "True"
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Glide.with(this).load("https://img.freepik.com/free-vector/colorful-bird-illustration-gradient_343694-1741.jpg?w=740&t=st=1707498081~exp=1707498681~hmac=8a4f9fed3ce3a1629afc9ed1e779feb8ca1d6aa92bfc49b1481bc897599d82bf").into(binding.imageView)
        val timer = object: CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                startActivity(Intent(this@MainActivity, HiActivity::class.java))
            }
        }
        timer.start()
    }
}

