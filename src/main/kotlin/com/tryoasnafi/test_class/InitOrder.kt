package com.tryoasnafi.test_class

// Constructor adalah cara untuk menginisialisasi properti ketika obyek dari kelas dibuat.
// Pada kotlin terdapat primary dan secondary constructor.
// Constructor yang berada di dalam header class disebut primary constructor,
// sedangkan secondary constructor diinisialisasi di dalam body class dengan keyword constructor()
class InitOrder(name: String) {
    val firstProperty = "First property: $name".also(::println) // inisialisasi properti lalu cetak ke layar
    init { // block ini akan langsung dieksekusi ketika pembuatan obyek pertama kali
        println("First initializer block that prints ${name}")
    }
    val secondaProperty = "Second property: ${name.length}".also(::println) // inisialisasi properti lalu cetak ke layar
    init { // block ini juga akan langsung dieksekusi ketika pembuatan obyek pertama kali
        println("Second initializer block that prints ${name.length}")
    }
}

fun main() {
    val initOrder = InitOrder("RPL")

    /* Output:
    First property: RPL
    First initializer block that prints RPL
    Second property: 3
    Second initializer block that prints 3
     */
}