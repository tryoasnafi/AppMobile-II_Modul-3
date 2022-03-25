package com.tryoasnafi.test_class

interface Human {
    fun think()
}

fun main() {
    // membuat sebuah object dari sebuah interface (anonymous class)
    var programmer: Human = object : Human {
        override fun think() { // override fungsi think()
            print("I am an example of Anonymous Inner Class ")
        }
    }

    programmer.think()

    /* Output:
    I am an example of Anonymous Inner Class
     */
}