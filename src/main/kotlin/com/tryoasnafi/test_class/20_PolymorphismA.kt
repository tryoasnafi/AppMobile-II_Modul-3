package com.tryoasnafi.test_class

// Dalam bahasa, polymorphism atau polimorfisme berarti banyak bentuk.
// Pada OOP, polymorphism ada 2 (dua) yaitu: overloading dan overriding

// Di bawah ini contoh overloading, berarti fungsi yang memiliki nama yang sama (pada satu kelas yang sama)
// tetapi memiliki karakteristik parameter yang berbeda: jumlah parameter, tipe parameter, dan urutan parameter.

fun printNumber(n : Number){
    println("Using printNumber(n : Number)")
    println(n.toString() + "\n")
}

fun printNumber(n : Int){
    println("Using printNumber(n : Int)")
    println(n.toString() + "\n")
}

fun printNumber(n : Double){
    println("Using printNumber(n : Double)")
    println(n.toString() + "\n")
}

fun printNumber(n:Int, str:String){
    println("Using printNumber(n:Int, str:String)")
    println(str + n.toString() + "\n")
}

fun main(){
    val a: Number = 99
    val b = 1
    val c = 3.1
    printNumber(a)
    printNumber(b)
    printNumber(c)
    printNumber(b, "Overloading function ")

    /* Output:
    Using printNumber(n : Number)
    99

    Using printNumber(n : Int)
    1

    Using printNumber(n : Double)
    3.1

    Using printNumber(n:Int, str:String)
    Overloading function 1
     */
}