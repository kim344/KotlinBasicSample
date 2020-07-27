package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day05Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        dataClassEx()
        literalEx()
    }

    data class Employee(val name : String, val age : Int, val salary : Int)

    private fun dataClassEx(){
        val first = Employee("Mark",30,1000)
        val second = Employee("John",24,5050)
        val third = first.copy()

        println(first.toString())
        println(second.toString())
        println(first == second)
        println(first == third)
        println(first.name)
    }

    private fun literalEx(){
        val instantFunc : (Int) -> Unit
        instantFunc = {number : Int ->
            println("Hello $number")
        }

        println(instantFunc(33))
        println(instantFunc.invoke(33))
    }
}