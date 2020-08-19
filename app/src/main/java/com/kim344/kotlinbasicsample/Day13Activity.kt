package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day13Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        literalEx()
        anonymousEx()

        var instantFunc : (Int, Int) -> Unit
        instantFunc = ::plus
        instantFunc(60,27)

        instantFunc = Object::minus
        instantFunc(36,12)

        instantFunc = Class()::average
        instantFunc(25,15)
    }

    private fun literalEx() {
        val instantFunc: (Int) -> Int? = {
            println("Hello $it")
            it
        }

        instantFunc(33)
        instantFunc.invoke(22)

        val result: Int? = instantFunc(33)
        println(result)

        val test : (Int) -> String = {
            "Sample $it 번째"
        }
    }

    private fun anonymousEx() {
        val instantFunc: (Int, Int) -> Unit = fun(number: Int, grade : Int): Unit {
            println("Hello $number $grade")
        }

        instantFunc(25,90)
        instantFunc.invoke(33,88)

        val test : (String) -> String = fun (str : String) : String {
            println(str)
            return "Test $str"
        }

        test("입니다.")
    }


    fun plus(a : Int, b : Int) = println("plus 호출 ${a + b}")

    object Object
    {
        fun minus(a : Int, b : Int) = println("Object 의 minus 호출 ${a - b}")
    }

    class Class
    {
        fun average(a : Int, b : Int) = println("Class average 호출 ${(a + b) / 2}")
    }
}