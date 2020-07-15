package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_day01.*

class Day01Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day01)

        val score = 65

        getGrade(score)
        getGrade2(score)
    }

    private fun getGrade(score: Int) {
        when (score / 10) {
            6 -> txt_grade.text = "D"
            7 -> txt_grade.text = "C"
            8 -> txt_grade.text = "B"
            9, 10 -> txt_grade.text = "A"
            else -> txt_grade.text = "F"
        }
    }

    private fun getGrade2(score: Int) {
        val grade : Char = when
        {
            score >= 90 -> 'A'
            score >= 80 -> 'B'
            score >= 70 -> 'C'
            score >= 60 -> 'D'
            else -> 'F'
        }

        txt_grade.text = grade.toString()
    }
}