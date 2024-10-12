package com.wanderapp.fundamentos_kotlin.clases

open class Phone(
    //Constructor de la clase
    private val number: Int
) {
    fun call(){
        println("llamando...")
    }
   open fun showNumber(){
        println("Mi número es: $number")
    }
}