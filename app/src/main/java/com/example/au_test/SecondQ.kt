package com.example.au_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.au_test.databinding.ActivityFirstQBinding
import com.example.au_test.databinding.ActivitySecondQBinding


class SecondQ : AppCompatActivity() {
    lateinit var binding: ActivitySecondQBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondQBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val feel: RecyclerView = findViewById((R.id.recycle))
        binding.recycle.adapter = RecyclerAdapter(this, Photo_list().list)
        binding.buttonGOTOQ3.setOnClickListener {
            if (binding.editTextAnswer2.text.toString().isNotEmpty() ) {
                first_time = "False"
                var convert1 = binding.editTextAnswer2.text.toString().lowercase().filterNot {it.isWhitespace()}
                if (convert1 == "turningred" || convert1 == "якраснею") {
                    right_answers += 1
                    Toast.makeText(this@SecondQ, "Всё верно! 1 балл вам!", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@SecondQ, Results::class.java))
                }
                else {
                    Toast.makeText(this@SecondQ, "Ответ неправильный, вы заработали 0 баллов", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@SecondQ, Results::class.java))
                }

            }
        }
    }
}