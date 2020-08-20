package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/*
init 초기화 블록
constructor 주 생성자 or 부 생성자
 */
class Day12Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        val sample = Sample("aa")

        val boy = Boy()
        val boy2 = Boy("Hi")
        val boy3 = Boy("ID", 31)
        val boy4 = Boy("ID", 31, 1)
        val boy5 = Boy(id = "Mark", age = 5)

        val shape = Shape()
        val shape2 = Shape(1,1)
        val shape3 = Shape(width = 100,x = 1,y = 5)
        val shape4 = Shape(1,1,10,10)
        val shape5 = Shape(width = 50,x = 1,height = 50,y = 1)

    }

    class Sample(id: String) {

        var id: String = ""

        init {
            this.id = id
        }

    }

    class Boy() {
        constructor(id: String) : this() {
            println(id)
        }

        constructor(id: String, age: Int) : this() {
            println(id)
        }

        constructor(id: String, age: Int, no: Int) : this() {
            println(id)
        }
    }

    class Shape() {
        var x: Int = 0
        var y: Int = 0
        var width: Int = 0
        var height: Int = 0

        constructor(x: Int, y: Int) : this() {
            this.x = x
            this.y = y
        }

        constructor(x: Int, y: Int, width: Int) : this() {
            this.x = x
            this.y = y
            this.width = width
        }

        constructor(x: Int, y: Int, width: Int, height: Int) : this() {
            this.x = x
            this.y = y
            this.width = width
            this.height = height
        }
    }
}


