package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day03Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        val person = Person("일길동",21)
        val person2 = Person2("이길동",22)
        val person3 = Person3("삼길동",23)
        val person4 = Person4("사길동",23)

        println("Person 이름 : $person.name")
        println("Person 나이 : $person.age")

        println("Person2 이름 : $person2.name")
        println("Person2 나이 : $person2.age")

        println("Person3 이름 : $person3.name")
        println("Person3 나이 : $person3.age")

        println("Person4 이름 : $person4.name")
        println("Person4 나이 : $person4.age")

        println("${Time(15,6).second} 초")
        println("${Time(6,10,9).second} 초")
        println("${Time(1).second} 초")

        val product = Product(7622,"코틀린 예제")
        product(108)
    }

    class Product(private val id : Int, private val name : String)
    {
        operator fun invoke(value : Int)
        {
            println(value)
            println("id : $id\nname : $name")
        }
    }

    // 생성자 (Constructor)
    class Person constructor(name : String, age : Int)
    {
        var name : String
        var age : Int

        // init 블록 여러개 나누기 가능
        init
        {
            this.name = name
        }

        init
        {
            this.age = age
        }

        init
        {
            this.name = name
            this.age = age
        }
    }

    class Person2 constructor(name : String, age : Int)
    {
        val name : String = name
        val age : Int = age
    }

    class Person3 constructor(private val name: String, val age: Int)

    // 생성자 프로퍼티 한번에 쓰기
    class Person4(val name : String, val age : Int)

    // 보조 생성자
    class Time(val second : Int)
    {
        init
        {
            println("init 블록 실행")
        }

        // 보조생성자1
        constructor(minute : Int, second : Int)  : this(minute * 60 + second)
        {
            print("보조 생성자 1 실행")
        }

        // 보조생성자2
        constructor(hour : Int, minute: Int, second: Int) : this(hour *60 + minute, second)
        {
            println("보조 생성자 2 실행")
        }

        init
        {
            println("또 다른 init 블록")
        }
    }
}