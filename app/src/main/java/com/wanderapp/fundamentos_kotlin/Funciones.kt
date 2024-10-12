package com.wanderapp.fundamentos_kotlin

import kotlin.math.abs

fun main(){
    newTopic("funciones con paremetros")
    val a = -97
    print(a)
    a.enableAbs(true)
    print(a.enableAbs(true))
}

fun suma(a: Int, b: Int): Int{
    //var c = a + b
    return a + b
}

fun resta(a: Int, b: Int) = a - b
// solo es aplicable cuando una funcion va a hacer algo simplificado como esto

infix fun Int.enableAbs(enable: Boolean) = if (enable) abs(this) else this

