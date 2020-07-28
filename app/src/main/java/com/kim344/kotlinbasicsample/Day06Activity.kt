package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day06Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        // it 식별자
        itEx(33)

        // 함수 참조
        var instantFunc: (Int, Int) -> Unit
        instantFunc = ::plus
        instantFunc(60, 27)

        instantFunc = Object::minus
        instantFunc(36, 12)

        instantFunc = Class()::average
        instantFunc(26, 15)

        // 고차 함수
        decorate {
            val a = 10
            val b = 5
            println("$a + $b = ${a+b}")
        }

        decorate { print("some"); print("task") }
    }

    // it 식별자
    private fun itEx(int: Int) {
        val instantFunc: (Int) -> Unit = {
            println("Hello $it")
        }
    }

    // 함수 참조
    fun plus(a: Int, b: Int) = println("plus 호출 ${a + b}")

    object Object {
        fun minus(a: Int, b: Int) = println("Object minus 호출 ${a - b}")
    }

    class Class {
        fun average(a: Int, b: Int) = println("Class average ${(a + b) / 2}")
    }

    // 고차 함수
    fun decorate(task: () -> Unit) {
        println("====작업 시작====")
        task()
        println("====작업 완료====")
    }
}