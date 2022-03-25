package com.tryoasnafi.test_class

// extends class Computer ke class LaptopB
class LaptopB : Computer {
    val batteryLife: Double // deklarasi attribute batteryLife dengan tipe Double

    // super() merujuk pada constructor parent class,
    // jika membuat secondary constructor maka harus memanggil delegate kelas parent dengan fungsi super()
    constructor(_name: String, _brand: String, _batteryLife: Double = 0.0) : super(_name, _brand) {
        this.batteryLife = _batteryLife // assign nilai batteryLife
    }

    fun info() {
        println("Name: $name")
        println("Brand: $brand")
        println("Battery Life: $batteryLife")
    }
}

fun main() {
    var myLaptop = LaptopB("Thinkpad X7", "Lenovo")
    myLaptop.info()
    println()
    myLaptop = LaptopB("Thinkpad X7", "Lenovo", 5.2)
    myLaptop.info()

    /* Output:
    Name: Thinkpad X7
    Brand: Lenovo
    Battery Life: 0.0

    Name: Thinkpad X7
    Brand: Lenovo
    Battery Life: 5.2
     */
}
