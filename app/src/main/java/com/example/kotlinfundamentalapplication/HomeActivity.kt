package com.example.kotlinfundamentalapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kotlinfundamentalapplication.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        val tittle=intent.getStringExtra("tittle")
        val description=intent.getStringExtra("description")

        binding.tvTittle.text=tittle
        binding.tvDescription.text=description

    }
}