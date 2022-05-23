package com.example.mylibrary

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.postventalibrary1.TestView1
import com.example.postventalibrary1.TestViewHost


class MainActivityKotlin : AppCompatActivity() {

    //private lateinit var binding: ActivityMainKotlinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TestViewHost()
        }

        /*
        binding = ActivityMainKotlinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.testView.apply {
            text = "BTN FROM KOTLIN"
            onClick = {
                //Toast.makeText(this@MainActivityKotlin,"PRESS BTN FROM KOTLIN",Toast.LENGTH_SHORT).show()

                val intent = Intent("com.example.postventalibrary1.MainActivityLibrary")
                startActivity(intent)
            }
        }

         */
    }
}