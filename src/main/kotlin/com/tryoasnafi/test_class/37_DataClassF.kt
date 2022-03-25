package com.tryoasnafi.test_class

// data class Student sudah dideklarasikan pada file 32_DataClassA.kt

fun main() {
    val meri = Student("Meri", 20)
    val badu = meri.copy("Badu") // membuat salinan obyek dengan argumen berbeda

    println(badu.toString()) // mencetak obyek badu

    // Destructuring, teknik mengekstrak data dari suatu obyek
    val name = badu.component1() // ekstrak data menggunakan object.componentN()
    val age = badu.component2() // ekstrak data menggunakan object.componentN()
    println("Name = $name") // cetak nilai name
    println("Age = $age") // cetak nilai age

    /* Output:
    Student(name=Badu, age=20)
    Name = Badu
    Age = 20
     */
}