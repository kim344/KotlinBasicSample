package com.kim344.kotlinbasicsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Day21Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_none)

        val person = listOf(Person("B"), Person("C"), Person("A"))
        println(person.sortedWith(Person.NameComparator))
    }
}

data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(p0: Person, p1: Person): Int =
            p0.name.compareTo(p1.name)
    }
}