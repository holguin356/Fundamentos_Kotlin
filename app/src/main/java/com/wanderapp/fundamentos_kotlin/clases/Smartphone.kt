package com.wanderapp.fundamentos_kotlin.clases

class Smartphone(
    number: Int,
    val isPrivate: Boolean):
    Phone(number) {
        override fun showNumber(){
            if(isPrivate) println("Desconojido...") else super.showNumber()
        }

}