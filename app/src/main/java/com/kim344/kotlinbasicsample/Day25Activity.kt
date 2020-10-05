package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day25Activity : AppCompatActivity() {
    private val taxRate = 0.09
    private val addTaxFunctionValue = { taxRate: Double, price: Double -> price + price * taxRate}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        println("클로저 사용: ${addTax(12.0)}")
        println("클로저 대신 튜플을 인자로 받는 함수를 사용: ${addTax(taxRate,12.0)}")
        println("함수 값에 적용: ${addTaxFunctionValue(taxRate,12.0)}")
        println("커리한 버전: ${addTaxCurried(taxRate)(12.0)}")
    }

    fun addTax(price: Double) = price + price * taxRate

    fun addTax(taxRate: Double, price: Double) = price + price * taxRate

    val addTaxCurried =
        {
            taxRate: Double ->
            {
                price: Double ->
                    price + price * taxRate
            }
        }
}