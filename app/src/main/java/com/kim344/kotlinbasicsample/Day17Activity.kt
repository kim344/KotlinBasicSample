package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day17Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        lambdaFunc()
        val result = calc(2, 1) { a: Int, b: Int -> a - b }
        println(result)
        invokeFunc()
    }

    private fun lambdaFunc() {
        val sum = { x: Int, y: Int -> x + y }
        println(sum(1, 2))
    }

    private fun calc(a: Int, b: Int, p: (Int, Int) -> Int) {
        println("$a, $b -> ${p(a, b)}")
    }

    private fun invokeFunc() {
        val first: ((Int) -> Boolean)?
        first = { it > 0 }
        println("람다1 : ${first(2)}, ${first.invoke(2)}")

        val second: (() -> String)?
        second = { "인자 없고 String 리턴" }
        println("람다2 : ${second()}, ${second.invoke()}")

        val third: (Int, Int) -> Int = { x, y -> x * y }
        println("람다3 : ${third(1, 2)}, ${third.invoke(3, 4)}")

        val fourth: (Int, Int) -> Unit = { x, y -> println("fourth : $x, $y") }
        println("람다4 : ${fourth(1, 2)}, ${fourth.invoke(3, 4)}")

        val fifth: ((Int, Int) -> Int, Int, Int, Int) -> Int = { x, y, z, k -> x(x(y, z), k) }
        println("람다5 : ${fifth({ x, y ->
            println("$this : $x, $y")
            if (x > y) x else y
        }, 1, 3, 2)}")
    }
}