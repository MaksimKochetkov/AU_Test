package com.example.au_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.au_test.databinding.ActivityHiBinding
import com.example.au_test.databinding.ActivityTimetoplayBinding


class Timetoplay : AppCompatActivity() {
    lateinit var binding: ActivityTimetoplayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimetoplayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        right_answers = 0
        binding.textViewYourName.text = name
        if (first_time != "True") {
            binding.textView5.text = "Давай поиграем\nещё раз"
        }
        Glide.with(this).load("https://lumiere-a.akamaihd.net/v1/images/image_8d236995.jpeg").into(binding.imageViewGOTONone)
        Glide.with(this).load("https://lumiere-a.akamaihd.net/v1/images/image_1749b559.jpeg").into(binding.imageViewGo)
        binding.imageViewGo.setOnClickListener {
            startActivity(Intent(this@Timetoplay, FirstQ::class.java))
        }
        binding.imageViewGOTONone.setOnClickListener {
            startActivity(Intent(this@Timetoplay, NoneActivity::class.java))
        }
    }
}