package com.tryoasnafi.test_class

// Enkapsulasi menggunakan setter getter di kotlin
// Enkapsulasi adalah cara membungkus properti sehingga tidak dapat diakses secara langsung tanpa izin
class EmployeeB(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field // getter method di kotlin

    var name: String = _name
        get() {
            return field.uppercase()
        }
        set(newName) { // setter method di kotlin
            field = newName
        }

    var age: Int = _age
        get() = field // field adalah keyword yang merujuk pada properti setter/getter
        set(newAge) {
            field = if (newAge > 0) newAge else throw IllegalArgumentException("Age must be greater than 0 (zero)")
        }
}

fun main() {
    val emp = EmployeeB(100, "Tryo Asnafi", 21)
    println("Id: ${emp.id}, Nama: ${emp.name}, Umur: ${emp.age}")
    emp.age = -1 // Jika age < 0, maka kembalikan error yang terjadi
    /* Output:
    Id: 100, Nama: TRYO ASNAFI, Umur: 21
    Exception in thread "main" java.lang.IllegalArgumentException: Age must be greater than 0 (zero)
        at com.tryoasnafi.test_class.EmployeeB.setAge(11_EnkapsulasiB.kt:20)
        at com.tryoasnafi.test_class._11_EnkapsulasiBKt.main(11_EnkapsulasiB.kt:27)
        at com.tryoasnafi.test_class._11_EnkapsulasiBKt.main(11_EnkapsulasiB.kt)
     */
}