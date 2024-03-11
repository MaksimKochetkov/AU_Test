package com.example.au_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.au_test.databinding.ActivityFirstQBinding
import com.example.au_test.databinding.ActivityTimetoplayBinding

class FirstQ : AppCompatActivity() {
    lateinit var binding: ActivityFirstQBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstQBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonGOTOQ2.setOnClickListener {
            if (binding.editTextAnswer1.text.toString().isNotEmpty() ) {
                var convert = binding.editTextAnswer1.text.toString().lowercase().filterNot {it.isWhitespace()}
                if (convert == "toystory" || convert == "историяигрушек") {
                    right_answers += 1
                    Toast.makeText(this@FirstQ, "Всё верно! 1 балл вам!", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@FirstQ, SecondQ::class.java))
                }
                else {
                    Toast.makeText(this@FirstQ, "Ответ неправильный, вы заработали 0 баллов", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@FirstQ, SecondQ::class.java))
                }

            }
        }
    }
}