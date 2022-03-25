package com.tryoasnafi.test_class

open class Teacher {
    // Gunakan keyword open agar dapat ditulis ulang oleh class child
    open fun teach() {
        println("Teaching...")
    }

    fun info() {
        println("I'm a Teacher.")
    }
}

class MathTeacher : Teacher() {
    // Gunakan keyword override agar dapat menulis ulang fungsi
    override fun teach() {
        println("Teaching Math...")
    }
}

fun main() {
    val teacher = Teacher()
    val mathTeacher = MathTeacher()
    mathTeacher.info() // Member (properti dan fungsi) parent class akan turun ke class yang meng-extends nya (child class)
    teacher.teach()
    mathTeacher.teach()

    /* Output:
    I'm a Teacher.
    Teaching...
    Teaching Math...
     */
}
