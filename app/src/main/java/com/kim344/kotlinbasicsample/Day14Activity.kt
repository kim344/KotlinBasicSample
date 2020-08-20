package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day14Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        decorate { str: String, str1: String ->
            val result: String = str + str1
            val a = 10
            val b = 5
            println("$result $a + $b = ${a + b}")
        }
        decorate { result: String, result1: String ->
            println("some")
            println("tasks")
        }

        val f : () -> Int = returnFunc(5)

        val result : Int = f()
        if (result+5 == 10){
            println("true")
        }
    }

    private fun decorate(task: (a: String, b: String) -> Unit) {
        print("====작업 시작====")
        task("A", "B")
        print("====작업 끝====")
    }

    private fun returnFunc(num: Int): () -> Int = {
        print(num)
        num
    }
}