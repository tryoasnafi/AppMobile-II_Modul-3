package com.tryoasnafi.test_class

class PersonD {
    var firstName: String
    var lastName: String
    var age: Int
    // ini adalah secondary constructor
    constructor(_firstName: String, _lastName: String, _age: Int) {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main() {
    val tryo = PersonD("Tryo", "Asnafi", 21)
    println("Name: ${tryo.firstName} ${tryo.lastName}")
    println("Age: ${tryo.age}")

    /* Output:
    Name: Tryo Asnafi
    Age: 21
     */
}