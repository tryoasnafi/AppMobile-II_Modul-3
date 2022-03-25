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
interface MyInterface{
    var str: String // abstract
    fun demo() // abstract
    fun func(){
        println("Hello") // non-abstract
    }
}
class MyClass: MyInterface{
    override var str: String = "Rekayasa Perangkat Lunak"
    override fun demo() {
        println("Demo Function")
    }
}
fun main() {
    val obj = MyClass()
    obj.demo()
    obj.func()
    println(obj.str)

    /* Output:
    Demo Function
    Hello
    Rekayasa Perangkat Lunak
     */
}