package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day11Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        mutableEx()

        val numbers : Array<String> = arrayOf("What's","your","name")
        printAllEx(*numbers)
    }

    private fun mutableEx(){
        val mutableList : MutableCollection<Int> = mutableListOf(1,2,3,4,5)

        println(mutableList)


        mutableList.add(1)
        println(mutableList)

        mutableList.addAll(listOf(6,7,8))
        println(mutableList)

        mutableList.remove(1)
        println(mutableList)

        mutableList.removeAll(listOf(1,2))
        println(mutableList)

        mutableList.retainAll(listOf(3,5))
        println(mutableList)

        mutableList.clear()
        println(mutableList)
    }

    private fun printAllEx(vararg tokens : String){
        for (token in tokens)
            print("$token")
    }
}