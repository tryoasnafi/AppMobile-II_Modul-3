package com.tryoasnafi.test_class

/*
Pada kotlin terdapat inheritance modifier yaitu: final, open, abstract, override
Jika tidak diberikan modifiernya, maka secara default akan diberikan "final"
- final: tidak bisa di-inheritance
- open: bisa di-inheritance
- abstract: harus di-inheritance
- override: dapat memodifikasi member
 */


// Interface adalah kelas yang tidak bisa dibuat menjadi obyek tetapi dapat di-extends (instansiasi) ke kelas turunan
// modifiernya secara default adalah "open",
// berbeda dengan abstract class, interface dapat diimplementasikan lebih dari satu (banyak interface dalam satu subclass)
interface X {
    fun demoX() {
        println("demoX function")
    }

    fun funcX()
}

interface Y {
    fun demoY() {
        println("demoY function")
    }

    fun funcY()
}

// Implementasi lebih dari satu interface ke dalam sebuah class
class MyClassA : X, Y {
    override fun funcX() {
        println("Hello") // override fungsi dari interface X
    }

    override fun funcY() {
        println("Hi") // override fungsi dari interface Y
    }
}

fun main() {
    val obj = MyClassA()
    obj.demoX()
    obj.demoY()
    obj.funcX()
    obj.funcY()

    /* Output:
    demoX function
    demoY function
    Hello
    Hi
     */
}