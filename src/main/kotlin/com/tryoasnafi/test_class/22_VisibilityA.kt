package com.tryoasnafi.test_class

/*
 Pada java dikenal yang namanya access modifier (default, public, private, protected) yang membatasi akses suatu member
 Pada kotlin juga terdapat beberapa access modifier yang disebut visibility modifier, yaitu:
 - public (global), akan ditetapkan secara default
 - private (hanya satu file)
 - protected (hanya pada file dan turunananya atau subclass)
 - internal (hanya pada module yang sama)
 */

// Private
private class privateExample {
    private val i = 1
    private fun doSomething() {
        println("Welcome to Private access!")
        println("Private Access : $i")
    }
    // gunakan sebuah fungsi ber-visibility public untuk mengakses member private
    fun callDoSomething(){
        doSomething();
    }
}

//Protected
open class C() {
    protected val i = 1
}

class D : C() {
    // properti i pada class C dapat diakses oleh class D karena menggunakan visibility protected
    fun getValue() : Int {
        println("Welcome to Protected access!")
        return i
    }
}

// internal
class internalExample {
    internal val i = 1
    internal fun doSomething() {
        println("Welcome to Internal access!")
        println("Internal Access : $i")
    }
}

//public
class publicExample {
    val i = 1
    fun doSomething() {
        println("Welcome to Public access!")
        println("Public Access : $i")
    }
}
fun main() {
    val objPrivate = privateExample()
    objPrivate.callDoSomething()
    val objProtected = D()
    println("Protected Access : ${objProtected.getValue()}")
    val objInternal = internalExample()
    objInternal.doSomething()
    val objPublic = publicExample()
    objPublic.doSomething()

    /*
    Welcome to Private access!
    Private Access : 1
    Welcome to Protected access!
    Protected Access : 1
    kotlin.Unit
    Welcome to Internal access!
    Internal Access : 1
    Welcome to Public access!
    Public Access : 1
     */
}
