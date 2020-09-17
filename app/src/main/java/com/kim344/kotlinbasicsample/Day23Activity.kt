package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day23Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        threeOne(20){ second, third -> second + third}
    }

    private fun threeOne(firstNum : Int, operation : (Int, Int) -> Int) : Int{
        val secondNum = 0
        val thirdNum = 0
        return firstNum + operation(secondNum,thirdNum)
    }
}