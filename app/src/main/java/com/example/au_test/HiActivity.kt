package com.example.au_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.au_test.databinding.ActivityHiBinding
import com.example.au_test.databinding.ActivityMainBinding

class HiActivity : AppCompatActivity() {

    lateinit var binding: ActivityHiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        name = ""
        first_time = "True"
        Glide.with(this).load("https://static1.moviewebimages.com/wordpress/wp-content/uploads/article/iIsrGQtaXe9i0a5r4uXtrqcwgN845M.jpg").into(binding.imageView2)
        binding.buttonContinue.setOnClickListener {
            if (binding.editTextName.text.toString().isNotEmpty()) {
                Toast.makeText(this@HiActivity, "Рад знакомству!", Toast.LENGTH_SHORT).show()
                name = binding.editTextName.text.toString()
                startActivity(Intent(this@HiActivity, Timetoplay::class.java))
            }
            else {
                Toast.makeText(this@HiActivity, "Как тебя зовут?", Toast.LENGTH_SHORT).show()
            }
        }
    }
}