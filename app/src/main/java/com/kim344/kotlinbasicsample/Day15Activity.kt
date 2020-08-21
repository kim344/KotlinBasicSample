package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day15Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        literalEx()

        val func : () -> Int = toFunction(1107)
        val funcString : () -> String = toFunction("안녕하세요")
        println(func)
        println(funcString)

        val square : Int = 11.map { it * it }
        println(square)
    }

    private fun literalEx(){
        val makeSure : Int.(left : Int, right : Int) -> Int

        makeSure = { left, right ->
            if (this < left) left
            else if (this > right) right
            else this
        }

        print(15.makeSure(20,40))
        print(18.makeSure(0,50))
        print(25.makeSure(0,18))

        val makeSure2 : (Int,Int,Int) -> Int = makeSure
        makeSure2(15,20,40) == 15.makeSure(20,40)
    }

    private fun <T>toFunction(value : T) : () -> T = {value}

    private fun <T,R> T.map(mapper : (T) -> R) : R{
        return mapper(this)
    }
}