package com.tryoasnafi.test_class

open class Rectangle {
    open fun draw() {
        println("From Base Class Rectangle")
    }
}
interface Polygon {
    fun draw() { // member pada interface ditetapkan 'open' secara default
        println("From interface Polygon")
    }
}
class Square() : Rectangle(), Polygon {
    // override fungsi draw
    override fun draw() {
        // Jika suatu kelas mewarisi method yang sama dari dua kelas berbeda (parent class dan interface),
        // maka pemanggilan super harus menyertakan tipenya (supertype), seperti: super<ClassName>.doSomething()
        super<Rectangle>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
    }
}

fun main(){
    val square = Square()
    square.draw()

    /* Output
    From Base Class Rectangle
    From interface Polygon
     */
}