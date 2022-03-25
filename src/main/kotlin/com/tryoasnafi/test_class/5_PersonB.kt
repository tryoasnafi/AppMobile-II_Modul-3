package com.tryoasnafi.test_class

class PersonB(_firstName: String, _lastName: String, _age: Int) {
    // deklarasi dan inisialisasi properti dalam satu statement tanpa menggunakan init {}
    var firstName: String = _firstName
    var lastName: String = _lastName
    var age: Int = _age
}

fun main() {
    val tryo = PersonB("Tryo", "Asnafi", 21)
    println("Name: ${tryo.firstName} ${tryo.lastName}")
    println("Age: ${tryo.age}")

    /* Output:
    Name: Tryo Asnafi
    Age: 21
     */
}