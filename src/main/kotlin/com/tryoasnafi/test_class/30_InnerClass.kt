package com.tryoasnafi.test_class

/*
Inner class adalah nested class yang diberikan keyword inner di depannya.
Sehingga dapat mengakses properti class di luarnya.
 */

class OuterA {
    val name = "Tryo"
    fun sayHello() = "Hi from the outside"
    inner class Inner {
        val b = "Inside Inner class."
        fun callMe() = "${sayHello()} $name"
    }
}

fun main() {
    val outer = OuterA()
    println("Using outer object: ${outer.Inner().b}")
    val inner = OuterA().Inner()
    println("Using inner object: ${inner.callMe()}")

    /* Output:
    Using outer object: Inside Inner class.
    Using inner object: Hi from the outside Tryo
     */
}