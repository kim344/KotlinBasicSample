package com.kim344.kotlinbasicsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Day01 Click
        btn_day01.setOnClickListener {
            startActivity(Intent(this,Day01Activity::class.java))
        }

        // Day01 Click
        btn_day02.setOnClickListener {
            startActivity(Intent(this,Day02Activity::class.java))
        }

    }

}