package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day22Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        val color: Color = Color.Red

        val font = when (color) {
            is Color.Red -> {
                "Noto sans"
            }
            is Color.Green -> {
                "Open Sans"
            }
            is Color.Blue -> {
                "Not ELSE"
            }
        }
    }
}

/*
sealed class 는 abstract class 객체 생성 X
생성자 는 private, public 설정 X
하위 class class, data class, object
 */
sealed class Color {
    object Red: Color()
    object Green: Color()
    object Blue: Color()
}

