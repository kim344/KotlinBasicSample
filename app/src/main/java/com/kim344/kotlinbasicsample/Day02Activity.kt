package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day02Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        // 매개변수 Exam
        println(getAvg(45, 65, true))
        getAvg(100, 50, true)
        println(getAvg(90))
        getAvg(66, print = true)
        getAvg(print = true)
        getAvg(print = true, b = 30, a = 10)

        // 가변 인수 Exam
        println(getSumOf(1, 2, 3, 4, 5))
        println(getSumOf(10, 20, 15))
        println(getSumOf(1, 5))
        println(getSumOf())

    }

    // 매개변수 선언 동시에 디폴트 값 초기화
    private fun getAvg(a: Int = 0, b: Int = 0, print: Boolean = false): Double {
        val result = (a + b) / 2.0
        if (print)
            println(result)
        return result
    }

    // 가변 인수
    private fun getSumOf(vararg numbers: Int): Int {
        val count = numbers.size
        var i = 0
        var sum = 0

        while (i < count) {
            sum += numbers[i]
            i += 1
        }
        return sum
    }

}