package com.tryoasnafi.test_class

// deklarasi dan inisialisasi langsung di primary constructor
class PersonC(var firstName: String, var lastName: String, var age: Int) {}

fun main() {
    val tryo = PersonC("Tryo", "Asnafi", 21)
    println("Name: ${tryo.firstName} ${tryo.lastName}")
    println("Age: ${tryo.age}")

    /* Output:
    Name: Tryo Asnafi
    Age: 21
     */
}