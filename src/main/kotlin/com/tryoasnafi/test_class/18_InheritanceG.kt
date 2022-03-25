package com.tryoasnafi.test_class

open class Base(val name: String) {
    init {
        println("Initializing Base")
    }
    open val size: Int = name.length.also {
        println("Initializing size in Base: $it")
    }
}
class Derived(name: String, val lastName: String) :
    Base(name.also { println("Argument for Base: $it") }) {
    init {
        println("Initializing Derived") // init block akan dieksekusi setelah inisialisasi kelas induk selesai
    }
    override val size: Int = (super.size + lastName.length).also {
        println("Initializing size in Derived: $it")
    }
}
fun main(){
    val turunan = Derived("Tryo", "Asnafi")
    turunan.size

    /* Output
    Argument for Base: Tryo             // Initialisasi pada kelas induk terlebih dahulu
    Initializing Base                   // Inisialisasi pada kelas induk terlebih dahulu
    Initializing size in Base: 4        // Inisialisasi pada kelas induk terlebih dahulu
    Initializing Derived                // Inisialisasi pada kelas turunan
    Initializing size in Derived: 10    // Inisialisasi pada kelas turunan
     */
}