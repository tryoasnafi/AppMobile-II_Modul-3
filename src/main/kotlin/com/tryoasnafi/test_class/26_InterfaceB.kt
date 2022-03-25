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
interface Named {
    val name: String
}
interface Person : Named { // interface inheritance
    val firstName: String
    val lastName: String
    override val name: String get() = "$firstName $lastName"
}

// implementasi interface ke dalam data class
data class NewEmployee(
    override val firstName: String,
    override val lastName: String,
    val position: String
) : Person

fun main(){
    // eksekusi data class
    val pegawai = NewEmployee("Tryo", "Asnafi", "Programmer")
    println(pegawai.name)

    /* Output:
    Tryo Asnafi
     */
}