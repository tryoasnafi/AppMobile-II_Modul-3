package com.tryoasnafi.test_class

/*
Pada kotlin terdapat inheritance modifier yaitu: final, open, abstract, override
Jika tidak diberikan modifiernya, maka secara default akan diberikan "final"
- final: tidak bisa di-inheritance
- open: bisa di-inheritance
- abstract: harus di-inheritance
- override: dapat memodifikasi member
 */

open class Mahasiswa(var nama: String, var nim: Int){
    open fun info() {
        println(nama + '\n' + nim);
    }
    override fun toString(): String {
        return "Mahasiswa { nama = $nama, nim = $nim }"
    }
}

class KetuaHima(nama: String, nim: Int, val jurusan: String) : Mahasiswa(nama, nim) {
    override fun info(){
        println("""
            $nama
            $nim
            $jurusan
        """.trimIndent())
    }
}

fun main() {
    val budi = Mahasiswa("Budi Gunawan", 1106123)
    val anton = KetuaHima("Anton", 1106789, "Teknik Informatika")
    println(anton.toString());
    println()
    anton.info()
    println("Jenis Kelas = " + anton.javaClass.simpleName)
    println()
    budi.info()
    println("Jenis Kelas = " + budi.javaClass.simpleName)
    val ucok = KetuaHima("Ucok", 1105239, "Teknik Elektro")
    println()
    ucok.info()
    println("Jenis Kelas = " + ucok.javaClass.simpleName)

    /* Output:
    Mahasiswa { nama = Anton, nim = 1106789 }

    Anton
    1106789
    Teknik Informatika
    Jenis Kelas = KetuaHima

    Budi Gunawan
    1106123
    Jenis Kelas = Mahasiswa

    Ucok
    1105239
    Teknik Elektro
    Jenis Kelas = KetuaHima

     */
}
