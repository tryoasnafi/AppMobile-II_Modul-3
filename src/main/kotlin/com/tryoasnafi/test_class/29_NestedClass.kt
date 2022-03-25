package com.tryoasnafi.test_class

/*
Nested class adalah kondisi di mana terdapat class yang memiliki member sebuah class
(class di dalam class)
 */

class Outer {
    val a = "Outside Nested class."
    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}

fun main() {
    // cara mengakses class Nested yang berada di dalam class Outer
    println(Outer.Nested().b)

    // membuat obyek dari class Nested
    val nested = Outer.Nested()
    println(nested.callMe())

    /* Output:
    Inside Nested class.
    Function call from inside Nested class.
     */
}