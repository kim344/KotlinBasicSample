package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.io.Serializable

class Day08Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        pairEx()
        tripleEx()
    }

    // Pair 두 변수 하나로 묶기
    private fun pairEx() {
        val (q,r) = divide(10,3)
        println("몫 : $q")
        println("나머지 : $r")
    }

    private fun divide(a: Int, b: Int): Pair<Int, Int> = Pair(a / b, a % b)

    data class Pair<out A, out B>(
        val first: A,
        val second: B
    ) : Serializable


    // Triple 세 변수 하나로 묶기
    private fun tripleEx(){
        val (diameter,_,area) = calculateCircle(5)
        println("지름 $diameter")
        println("넓이 $area")
    }

    private fun calculateCircle(radius : Int) : Triple<Int,Double,Double> = Triple(radius * 2, radius * 2 * 3.14, 3.14 * radius * radius)

    data class Triple<out A, out B, out C>(
        val first : A,
        val second : B,
        val third : C
    ) : Serializable
}