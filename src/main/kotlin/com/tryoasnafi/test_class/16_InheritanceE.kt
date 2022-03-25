package com.tryoasnafi.test_class

open class NewPerson {
    open var age: Int = 1
}
class CheckedPerson: NewPerson() {
    // override property dengan custom setter/getter
    override var age: Int = 1
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Age can not be negative")
        }
}
fun main() {
    val person = NewPerson()
    person.age = -5 // Works
    println(person.age)
    val checkedPerson = CheckedPerson()
    checkedPerson.age = -5 // Throws IllegalArgumentException : Age can not be negative
    println(checkedPerson.age)

    /* Output:
    -5
    Exception in thread "main" java.lang.IllegalArgumentException: Age can not be negative
        at com.tryoasnafi.test_class.CheckedPerson.setAge(16_InheritanceE.kt:9)
        at com.tryoasnafi.test_class._16_InheritanceEKt.main(16_InheritanceE.kt:17)
        at com.tryoasnafi.test_class._16_InheritanceEKt.main(16_InheritanceE.kt)
     */
}