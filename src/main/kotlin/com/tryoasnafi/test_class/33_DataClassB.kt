package com.tryoasnafi.test_class

// data class Student sudah dideklarasikan pada file 32_DataClassA.kt

fun main() {
    val boni = Student("Boni", 21)
    val newBoni = Student("Boni", 21)
    val meri = Student("Meri", 20)
    val newMeri = meri

    if (boni.equals(newBoni)) println("boni is equal to newBoni")
    else println("bonis is not equal to newBoni")

    if (boni == meri) println("boni is equal to meri")
    else println("bonis is not equal to meri")

    if (meri === newMeri) println("meri is identical with newMeri")
    else println("meri is not identical with newMeri")

    // hashCode untuk mengecek nilai reference obyek pada memory, jika referece sama maka dua obyek identik
    println("Hashcode of boni: ${boni.hashCode()}")
    println("Hashcode of newBoni: ${newBoni.hashCode()}")
    println("Hashcode of meri: ${meri.hashCode()}")
    println("Hashcode of newMeri: ${newMeri.hashCode()}")

    /* Output:
    Hashcode of boni: 64368173
    Hashcode of newBoni: 64368173
    Hashcode of meri: 74232837
    Hashcode of newMeri: 74232837
     */
}