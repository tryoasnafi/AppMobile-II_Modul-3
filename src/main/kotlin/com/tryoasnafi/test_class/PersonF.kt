package com.tryoasnafi.test_class

class PersonF(val firstName: String, val lastName: String) {
    init {
        println("Sedang inisialisasi obyek!")
    }
    // delegate ke primary constructor
    constructor(firstName: String, lastName: String, age: Int) : this( firstName, lastName) {
        println("Name : $firstName $lastName")
        println("Age : $age")
        println()
    }

    // delegate ke primary constructor
    constructor(_firstName: String, _lastName:String, _country:String): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Country : $_country")
        println()
    }

    // this pada constructor ini akan mendelegate secondary constructor yang mendelegate primary constructor,
    // delegate ke primary constructor secara tidak langsung.
    constructor(_firstName: String, _lastName:String, _age:Int, _country:String): this(_firstName, _lastName, _age){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println("Country : $_country")
    }
}

fun main() {
    val anton = PersonF("Anton", "Sejati")
    val budi = PersonF("Budi", "Gunawan", 21)
    val caca = PersonF("Caca", "Andika", "Indonesia")
    val dono = PersonF("Dono", "Putri", 25, "Indonesia")

    /* Output:
    Sedang inisialisasi obyek! // dieksekusi ketika membuat obyek anton
    Sedang inisialisasi obyek! // dieksekusi ketika membuat obyek budi
    Name : Budi Gunawan
    Age : 21

    Sedang inisialisasi obyek! // dieksekusi ketika membuat obyek caca
    Name : Caca Andika
    Country : Indonesia

    Sedang inisialisasi obyek! // dieksekusi ketika membuat obyek caca, berasal dari secondary constructor pertama
    Name : Dono Putri
    Age : 25

    Name : Dono Putri // diekseskusi ketika membuat obyek caca
    Age : 25
    Country : Indonesia
     */
}