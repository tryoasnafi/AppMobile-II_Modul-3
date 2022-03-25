package com.tryoasnafi.test_class

/*
Pada kotlin terdapat inheritance modifier yaitu: final, open, abstract, override
Jika tidak diberikan modifiernya, maka secara default akan diberikan "final"
- final: tidak bisa di-inheritance
- open: bisa di-inheritance
- abstract: harus di-inheritance
- override: dapat memodifikasi member
 */


// Abstact adalah kelas yang tidak bisa dibuat menjadi obyek tetapi dapat di-extends ke kelas turunan
// biasanya memiliki member yang juga abstract dan tidak memiliki implementasi hanya deklarasi saja
abstract class Vehicle(
    val name: String, // properti non-abstract
    val color: String,
    val weight: Double
) {
    // abstract property harus di-override oleh kelas turunan (child)
    abstract var maxSpeed: Double

    // abstract function harus diimplementasi pada kelas turunan (child)
    abstract fun start()
    abstract fun stop()
    abstract fun sound()

    // fungsi non-abstract
    fun displayDetails() = println("Name: $name, Color: $color, Weight: $weight, Max Speed: $maxSpeed")

}

class Car(
    name: String,
    color: String,
    weight: Double,
    override var maxSpeed: Double // override abstract property
) : Vehicle(name, color, weight) {
    // implementasi abstract function
    override fun start() = println("Car Started")
    override fun stop() = println("Car Stopped")
    override fun sound() = println("Brum...brum...brumm!")
}

class Motorcycle(
    name: String,
    color: String,
    weight: Double,
    override var maxSpeed: Double // override abstract property
) : Vehicle(name, color, weight) {
    // implementasi abstract function
    override fun start() = println("Bike Started")
    override fun stop() = println("Bike Stopped")
    override fun sound() = println("Preng...preng...preng!")
}

fun main() {
    val car = Car("Ferrari 812 Superfast", "red", 1525.0, 339.60)
    val motorCycle = Motorcycle("Ducati 1098s", "red", 173.0, 271.0)
    car.displayDetails()
    motorCycle.displayDetails()
    car.start()
    car.sound()
    car.stop()
    motorCycle.start()
    motorCycle.sound()
    motorCycle.stop()

    /* Output:
    Name: Ferrari 812 Superfast, Color: red, Weight: 1525.0, Max Speed: 339.6
    Name: Ducati 1098s, Color: red, Weight: 173.0, Max Speed: 271.0
    Car Started
    Brum...brum...brumm!
    Car Stopped
    Bike Started
    Preng...preng...preng!
    Bike Stopped
     */
}