package com.example.au_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.au_test.databinding.ActivityResultsBinding
import com.example.au_test.databinding.ActivitySecondQBinding

class Results : AppCompatActivity() {
    lateinit var binding: ActivityResultsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView7.text = right_answers.toString()
        if (right_answers == 1) {
            binding.apply {
                textView11.text = "Вы ответили лишь на 1 вопрос\nпопробуй ещё раз и результат\nобязательно станет лучше!"
                textView12.text = "Ты правильно ответил на"
                textViewAnswers.text = right_answers.toString()
                textView14.text = "вопрос"
            }
        }
        else if (right_answers == 2) {
            binding.apply {
                textView11.text = "Молодчина!\nвсё верно!"
                textView12.text = "Ты правильно ответил на"
                textViewAnswers.text = right_answers.toString()
                textView14.text = "вопроса"
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