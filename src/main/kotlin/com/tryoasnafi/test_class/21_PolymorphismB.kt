package com.tryoasnafi.test_class

// Dalam bahasa, polymorphism atau polimorfisme berarti banyak bentuk.
// Pada OOP, polymorphism ada 2 (dua) yaitu: overloading dan overriding

// Di bawah ini contoh overriding, berarti fungsi yang memiliki nama yang sama pada kelas yang berbeda,
// sehingga memiliki behavior yang berbeda.

open class MyBase {
    // harus menggunakan keyword "open" pada member yang ingin di-override
    open fun think () {
        println("Hey!! i am thinking ")
    }
}
class MyDerived: MyBase() { // inheritance terjadi ketika melakukan extends ke kelas induk
    // harus menggunakan keyword "override" agar dapat menulis ulang member (fungsi dan properti)
    override fun think() {
        println("I Am from Child")
    }
}
fun main() {
    val myBase = MyBase()
    myBase.think()
    val myDerived = MyDerived()
    myDerived.think()

    /* Output:
    Hey!! i am thinking
    I Am from Child
     */
}