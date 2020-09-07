package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day20Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        getStringLength("안녕하세요")
        getStringLength(1)
        getStringLength(null)

        print(alphabet())
        print(withAlphabet())
        print(applyAlphabet())
    }

    private fun getStringLength(obj: Any?): Int? {
        if (obj is String) {
            return obj.length
        }

        return null
    }

    private fun alphabet(): String {
        val result = StringBuilder()
        for (letter in 'A'..'Z') {
            result.append(letter)
        }
        result.append("\nNow I know the alphabet")
        return result.toString()
    }

    private fun withAlphabet(): String {
        val stringBuilder = StringBuilder()
        return with(stringBuilder) {
            for (letter in 'A'..'Z') {
                this.append(letter)
            }
            append("\nNow I know the alphabet")
            this.toString()
        }
    }

    private fun applyAlphabet() = StringBuilder().apply {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append ("\nNow I know the alphabet!")
    }.toString()

}