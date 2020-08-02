package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder

class Day09Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        replaceEx()
        stringEx()
        lazyEx()
    }

    // 문자열 찾기
    private fun replaceEx(){
        val comment = "Love begets love"

        println(comment.replace("love","hate",ignoreCase = true))
        println(comment.replaceFirst("love","compliment",ignoreCase = true))
        println(comment.replaceRange(5..10,"hello"))
    }

    // StringBuilder
    private fun stringEx(){
        val builder = StringBuilder()
            .append("2020 ")
            .append("Kotlin")
            .append("Study")

        val result = builder.toString()
        println(result)
    }

    // lazy 게으른 초기화
    private fun lazyEx(){
        class AAA
        {
            var num : Int = 0
            val num2 by lazy { num * 5 }
        }

        val one = AAA()
        println(one.num2)
        one.num = 10
        println(one.num2)

        val two = AAA()
        two.num = 4
        println(two.num2)
    }
}