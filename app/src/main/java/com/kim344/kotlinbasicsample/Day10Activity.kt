package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        runEx()
        letEx()
        withEx()
        applyEx()
        alsoEx()
    }

    // run 코드 중복 줄이기 (이미 생성된 객체의 method 나 field 를 연속적으로 호출할 때 사용)
    private fun runEx(){
        val a = 10
        val b = 5

        (a * b - 2 * a).run {
            if (this > 0)
                println(this)
        }
    }

    // let 코드 중복 줄이기 (run 과 동일한 역할을 수행, null 안정성 검사 자주 사용)
    private fun letEx(){
        val a = 10
        val b = 5

        (a * b - 2 * a).let { result : Int ->
            if (result > 0)
                println(result)
        }

        (a * b - 2 * a).let {
            if (it > 0)
                println(it)
        }
    }

    // with 코드 중복 줄이기 (run, let 과 동일한 기능)
    private fun withEx(){
        val a = 3
        val b = 7

        with(a * b - b * b){
            println(this)
            print(-this)
        }
    }

    // apply 객체 생성 및 초기화
    private fun applyEx(){

        class Person {
            var name : String = ""
            var age : Int = 0
            var money : Int = 0

            override fun toString(): String = "$name $age $money"
        }

        println(Person().apply {
            this.name = "Mark"
            age = 15
            money = 9999
        })
    }

    // also 객체 생성 및 초기화 (apply 와 동일한 역할)
    private fun alsoEx(){

        class Person {
            var name : String = ""
            var age : Int = 0
            var money : Int = 0

            override fun toString(): String = "$name $age $money"
        }

        println(Person().also {
            it.name = "James"
            it.age = 22
            it.money = 1000
        })

        println(Person().also { person ->
            person.name = "Max"
            person.age = 55
            person.money = 3000
        })
    }
}