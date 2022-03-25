package com.tryoasnafi.test_class

// Enkapsulasi menggunakan setter getter di kotlin
// Enkapsulasi adalah cara membungkus properti sehingga tidak dapat diakses secara langsung tanpa izin
class Employee(_id: Int, _name: String, _position: String) {
    val id: Int = _id
        get() = field // getter method di kotlin

    var name: String = _name
        get() = field
        set(newName) { // setter method di kotlin
            field = newName
        }

    var position: String = _position
        get() = field // field adalah keyword yang merujuk pada properti setter/getter
        set(newPosition) {
            field = newPosition
        }
}

fun main() {
    val emp = Employee(100, "Tryo Asnafi", "Software Engineer")
    println("Id: ${emp.id}, Nama: ${emp.name}, Posisi: ${emp.position}")

    /* Output:
    Id: 100, Nama: Tryo Asnafi, Posisi: Software Engineer
     */
}