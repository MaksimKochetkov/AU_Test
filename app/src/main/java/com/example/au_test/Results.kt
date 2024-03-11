package com.example.au_test

import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.au_test.databinding.ActivityResultsBinding


class Results : AppCompatActivity() {
    lateinit var binding: ActivityResultsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView7.text = name
        val metrics: DisplayMetrics = applicationContext.resources.displayMetrics
        val Textsize: Float = binding.textView11.textSize / metrics.density
        if (right_answers != 0) {

            binding.apply {
                textView7.text = "ПОЗДРВЛЯЮ,"
                textView11.setTextColor(ContextCompat.getColor(this@Results,R.color.barbie))
                textView11.setTextSize(Textsize+20)
                textView11.text = name
                textView12.text = "Ты правильно ответил на"
                textViewAnswers.text = right_answers.toString()
                if (right_answers == 1) {
                    textView14.text = "вопрос"
                }
                else if (right_answers == 2) {
                    textView14.text = "вопроса"
                }
            }
        }


        binding.buttonAgain.setOnClickListener {
            startActivity(Intent(this@Results, Timetoplay::class.java))
        }
        binding.buttonRageQuit.setOnClickListener {
            startActivity(Intent(this@Results, HiActivity::class.java))
        }

    }
}