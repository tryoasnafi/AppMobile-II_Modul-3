package com.tryoasnafi.test_class

class Greeter {
    var text: String = "" // properti text untuk class Greeter

    fun greet() {
        println("Hello world object")
    }

    // Overloading: membuat fungsi yang sama dengan paramater yang berbeda dan aksi yang berbeda.
    fun greet(name: String) {
        println("$text $name") // mencetak properti $text dan parameter $name
    }

    fun withRetVal(name: String): String { // name bertipe String dengan nilai kembalian berupa String juga
        return "$text $name" // mengembalikan nilai properti $text dan parameter $name
    }

}