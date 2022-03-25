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
interface A {
    fun demo() {
        println("From interface A")
    }
}
interface B {
    fun demo() {
        println("From interface B")
    }
}
// Ketika terdapat dua interface yang diimplementasikan dan terdapat memember yang sama, maka gunakan supertype
// super<InterfaceName>.doSomething()
class MyClassB: A, B {
    override fun demo() {
        super<A>.demo()
        super<B>.demo()
    }
}
fun main() {
    val obj = MyClassB()
    obj.demo()

    /* Output:
    From interface A
    From interface B
     */
}