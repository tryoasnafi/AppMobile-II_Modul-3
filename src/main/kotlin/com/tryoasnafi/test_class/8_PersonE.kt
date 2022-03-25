package com.tryoasnafi.test_class

class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 17 // inisialisasi nilai awal

    // ini adalah secondary constructor
    constructor(_firstName: String, _lastName: String) {
        firstName = _firstName
        lastName = _lastName
    }
    // overloading secondary constructor
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName) {
        age = _age
    }

    fun cetakInfo() {
        println("Name: $firstName $lastName")
        println("Age: $age")
    }
}

fun main() {
    val tryo = PersonE("Tryo", "Asnafi")
    tryo.cetakInfo()
    println()
    val trysna = PersonE("Trysna", "D. Jong", 21)
    trysna.cetakInfo()

    /* Output:
    Name: Tryo Asnafi
    Age: 17 // karena age tidak diberikan ketika obyek dibuat maka ia menggunakan secondary constructor pertama

    Name: Trysna D. Jong
    Age: 21 // karena age diberikan ketika obyek dibuat maka ia menggunakan secondary constructor kedua
     */
}