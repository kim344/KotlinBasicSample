package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day19Activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        twoAndThree(10) { a, b -> a + b }
        twoAndThree(50){a,b -> a*b}

        val ex1 : (String) -> Unit = { str : String ->
            println("$str ex1 람다함수")
        }

        val ex2 : (String) -> Unit = { str : String ->
            println("$str ex2 람다함수")
        }

        val ex3 : (String) -> String = { str : String ->
            println("$str ex3 람다함수")
            "return Message"
        }

        higherFunc(ex1)
        higherFunc(ex2)
        returnString(ex3)
    }

    private fun twoAndThree(a : Int,operation : (Int, Int) -> Int){
        val result = operation(1,2)
        println("result ${a + result}")
    }

    private fun higherFunc( hf : (String) -> Unit){
        hf("higherFunc 호출")
    }

    private fun returnString( rs : (String) -> String){
        val rtStr = rs("returnString 호출")
        println(rtStr)
    }
}