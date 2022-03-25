package com.tryoasnafi.test_class

// data class khusus menangani data
data class Student(val name: String, val age: Int)

fun main() {
    val boni = Student("Boni", 21)
    val meri = Student("Meri", 20)
    println("Student Name is: ${boni.name}")
    println("${boni.name}'s Age is: ${boni.age}")
    println("Student Name is: ${meri.name}")
    println("${meri.name}'s Age is: ${meri.age}")

    /* Output:
    Student Name is: Boni
    Boni's Age is: 21
    Student Name is: Meri
    Meri's Age is: 20
     */
}