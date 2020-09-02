package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day18Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        testFunc(30,10){ age, grade -> println("결과 : ${age * grade}")}

        val third: (String, Int) -> Boolean = { x, y ->
            y == Integer.parseInt(x)
        }

        println("10,10 ${third("10",10)}")
        println("11,10 ${third("11",10)}")

        checkFunc{ str ,number -> number == Integer.parseInt(str)}
    }

    private fun testFunc(age : Int, grade : Int, p : (Int, Int) -> Unit){
        println("age : $age")
        println("grade : $grade")
        p(5,2)
    }

    private fun checkFunc( check : (String, Int) -> Boolean ){
        println("checkFunc : ${check("10",10)}")
    }


}