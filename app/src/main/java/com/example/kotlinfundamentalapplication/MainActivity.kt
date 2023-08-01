package com.example.kotlinfundamentalapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kotlinfundamentalapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnSubmit.setOnClickListener {

            val tittle = binding.edTittle.text.toString()
            val description = binding.edDescription.text.toString()

            val intent = Intent(this, HomeActivity::class.java)

            intent.putExtra("tittle", tittle)
            intent.putExtra("description", description)

            startActivity(intent)
        }
    }
}