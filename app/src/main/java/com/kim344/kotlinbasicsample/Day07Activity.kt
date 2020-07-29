package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day07Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        // enum Class
        val mode : Mode = Mode.PEN
        when (mode) {
            Mode.SELECTION -> println("선택모드")
            Mode.PEN -> println("펜 모드")
            Mode.SHAPE -> println("도형 모드")
            Mode.ERASER -> println("지우개 모드")
        }

        if (mode.number == 1){
            println("true")
        } else {
            println("false")
        }

        mode.printNumber()


        // sealed Class
        val instance : Outer = Outer.Three()

        val text : String = when (instance)
        {
            is Outer.One -> "첫번째"
            is Outer.Two -> "두번째"
            is Outer.Three -> "세번째"
        }

        println(text)
    }

    enum class Mode(val number : Int)
    {
        SELECTION(0),
        PEN(1),
        SHAPE(2),
        ERASER(3);

        fun printNumber(){
            println("모드 : $number")
        }
    }

    sealed class Outer
    {
        class One : Outer()
        class Two : Outer()
        class Three : Outer()
    }

}