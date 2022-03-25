package com.tryoasnafi.test_class

// ubah visibility class parent menjadi open agar dapat digunakan
open class Computer(val name: String, val brand: String) {}

// extends pada kotlon menggunakan simbol colon atau titik dua (:)
// variabel name dan brand dideklarasi di parent class
class Laptop(name: String, brand: String, val batteryLife: Double) : Computer(name, brand) {
    fun info() {
        println("Name: $name")
        println("Brand: $brand")
        println("Battery Life: $batteryLife")
    }
}

fun main() {
    val myLaptop = Laptop("Thinkpad X7", "Lenovo", 5.2)
    myLaptop.info()

    /* Output:
    Name: Thinkpad X7
    Brand: Lenovo
    Battery Life: 5.2
     */
}
