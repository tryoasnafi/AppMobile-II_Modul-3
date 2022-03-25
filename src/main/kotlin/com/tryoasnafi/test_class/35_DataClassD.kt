package com.tryoasnafi.test_class

// data class Student sudah dideklarasikan pada file 32_DataClassA.kt

fun main() {
    val meri = Student("Meri", 20)
    val badu = meri.copy("Badu") // membuat salinan obyek dengan argumen berbeda

    println(badu.toString()) // mencetak obyek badu

    /* Output:
    Student(name=Badu, age=20)
     */
}