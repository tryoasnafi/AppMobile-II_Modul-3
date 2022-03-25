package com.tryoasnafi.test_class

open class EmployeeInfo {
    open val baseSalary : Double = 10000.0
    open fun displayDetails() {
        println("I'm an Employee")
    }
}

class Developer: EmployeeInfo() {
    // memanggil properti/fungsi pada kelas induk menggunakan keyword 'super'
    override val baseSalary: Double = super.baseSalary + 15000
    override fun displayDetails() {
        super.displayDetails() // I'm an Employee
        println("I'm a Developer")
    }
}

fun main() {
    val employee = EmployeeInfo()
    println("${employee.javaClass.simpleName} base salary is ${employee.baseSalary}")
    employee.displayDetails()
    println()
    val developer = Developer()
    println("${developer.javaClass.simpleName} base salary is ${developer.baseSalary}")
    developer.displayDetails()

    /* Output:
    EmployeeInfo base salary is 10000.0
    I'm an Employee

    Developer base salary is 25000.0
    I'm an Employee
    I'm a Developer
     */
}