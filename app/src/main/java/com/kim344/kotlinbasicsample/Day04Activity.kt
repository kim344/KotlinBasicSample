package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day04Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day04)

        AAA().aaa()
        BBB().aaa()

        // for 문 여러가지 형태
        forType01()
        forType02()
        forType03()
        forType04()
    }

    private fun forType01() {
        var sum : Int = 0
        for (i in 1..10) {
            sum += i
        }
        println(sum)
    }

    private fun forType02() {
        var sum : Int = 0
        for (i in 1 until 10) {
            sum += i
        }
        println(sum)
    }

    private fun forType03() {
        var sum : Int = 0
        for (i in 2..10 step 2) {
            sum += i
        }
        println(sum)
    }

    private fun forType04() {
        var sum : Int = 0
        for (i in 10 downTo 1 step 2) {
            sum += i
        }
        println(sum)
    }

    // Override Keyword  open
    open class AAA{
        open fun aaa(){
            println("aaa")
        }
    }

    class BBB : AAA() {
        override fun aaa() {
            super.aaa()
            println("bbb")
        }
    }
}