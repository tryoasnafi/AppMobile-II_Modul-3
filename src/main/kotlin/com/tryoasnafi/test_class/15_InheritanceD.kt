package com.tryoasnafi.test_class

import java.text.NumberFormat
import java.util.Locale

open class Job {
    // gunakan keyword open sehingga dapat ditulis ulang oleh child class
    open val baseSalary: Int = 3_000_000
}

class Programmer : Job() {
    // gunakan keyword override untuk menulis ulang properti
    override val baseSalary: Int = 5_000_000
}

class SoftwareEngineer : Job() {
    // gunakan keyword override untuk menulis ulang properti
    override val baseSalary: Int = 7_000_000
}

class ProjectManager : Job() {
    // gunakan keyword override untuk menulis ulang properti
    override val baseSalary: Int = 10_000_000
}

fun toRupiahFormat(salary: Int): String {
    return NumberFormat.getCurrencyInstance(Locale("id", "ID")).format(salary).toString()
}

fun main() {
    val job = Job()
    val programmer = Programmer()
    val softwareEngineer = SoftwareEngineer()
    val projectManager = ProjectManager()

    println("Rata-rata UMR di Riau = ${toRupiahFormat(job.baseSalary)}")
    println("Rata-rata gaji Programmer di Indonesia = ${toRupiahFormat(programmer.baseSalary)}")
    println("Rata-rata gaji Software Engineer di Indonesia = ${toRupiahFormat(softwareEngineer.baseSalary)}")
    println("Rata-rata gaji Project Manager di Indonesia = ${toRupiahFormat(projectManager.baseSalary)}")

    /* Output:
    Rata-rata UMR di Riau = Rp3.000.000,00
    Rata-rata gaji Programmer di Indonesia = Rp5.000.000,00
    Rata-rata gaji Software Engineer di Indonesia = Rp7.000.000,00
    Rata-rata gaji Project Manager di Indonesia = Rp10.000.000,00
     */
}
