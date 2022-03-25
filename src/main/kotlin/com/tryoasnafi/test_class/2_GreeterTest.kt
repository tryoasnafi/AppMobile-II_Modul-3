package com.tryoasnafi.test_class

fun main() {
    val greeter = Greeter()
    greeter.greet() // output: Hello world object
    greeter.text = "Hi" // menetapkan nilai properti text menjadi "Hi"
    greeter.greet("Anton") // output: Hi Anton
    greeter.greet("Budi") // output: Hi Budi
    greeter.text = "Hello Programmer" // menetapkan nilai properti text menjadi "Hello Programmer"
    println(greeter.withRetVal("Dono")) // output: Hello Programmer Dono
}
