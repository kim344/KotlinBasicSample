package com.kim344.kotlinbasicsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ex.*

class Day16Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex)

        testCallback { Log.e("TEST", "Callback Data: $it") }
    }

    private fun testCallback(callback: (String) -> Unit) {
        callback.invoke("return callback")
    }

    private fun actionFunc(num: Int, callback: (String) -> Unit) {
        Log.e("num","$num")
        callback("Hello")
    }
}