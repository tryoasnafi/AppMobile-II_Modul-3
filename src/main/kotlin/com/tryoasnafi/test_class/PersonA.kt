package com.tryoasnafi.test_class

class PersonA(_firstName: String, _lastName: String, _age: Int) {
    var firstName: String
    var lastName: String
    var age: Int
    init { // initialisasi parameter constructor ke dalam properti class menggunakan init {}
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main() {
    val tryo = PersonA("Tryo", "Asnafi", 21)
    println("Name: ${tryo.firstName} ${tryo.lastName}")
    println("Age: ${tryo.age}")

    /* Output:
    Name: Tryo Asnafi
    Age: 21
     */
}