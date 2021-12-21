package com.example.dogapp

import MainViewModel
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changeDogButton: Button = findViewById(R.id.button)

        viewModel.currentlyDisplayImage.observe(this,{
            val mainImage : ImageView = findViewById(R.id.imageView)
            Picasso.with(this).load(it.imgSrcUrl).into(mainImage)

        })
        changeDogButton.setOnClickListener{
            viewModel.getNewDog()
        }
    }
}