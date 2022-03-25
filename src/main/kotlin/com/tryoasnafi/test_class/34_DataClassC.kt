package com.tryoasnafi.test_class

// data class Student sudah dideklarasikan pada file 32_DataClassA.kt

fun main() {
    val meri = Student("Meri", 20)
    val badu = meri.copy("Badu") // membuat salinan obyek dengan argumen berbeda

    if(meri == badu) println("meri is equal to badu.")
    else println("meri is not equal to badu.")

    println("Hashcode of meri: ${meri.hashCode()}")
    println("Hashcode of badu: ${badu.hashCode()}")

    /* Output:
    meri is not equal to badu.
    Hashcode of meri: 74232837
    Hashcode of badu: 63941860
     */
}