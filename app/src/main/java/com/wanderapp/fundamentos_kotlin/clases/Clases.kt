package com.wanderapp.fundamentos_kotlin.clases

import com.wanderapp.fundamentos_kotlin.newTopic


fun main(){

    newTopic("clases")
    //instancia a una clase, es el puente un vinculo un enlace entre los dos enlaces
    val phone = Phone(2785773)
    phone.call()
    phone.showNumber()

    newTopic("Herencia")
    val smartphone = Smartphone(2785773, true)
    smartphone.call()
    smartphone.showNumber()

    newTopic("Data Class")
    val myUser = User(0, "Sebastían","Holguin", Group.FAMILY.ordinal)
    val bro = myUser.copy(1, "David")
    val friend = bro.copy(2, group = Group.FRIEND.ordinal)
    println(friend)

    newTopic("Funciones de alcance WITH")
    //crea un bloque de codigo instanciado() en vez de poner solo la instancia se llama directamente
    with(smartphone){
        call()
    }

    friend.group = Group.WORK.ordinal
    friend.name = "Juan"
    friend.apply {
        lastName = "Osorio"
        name = "Andres"
    }
    println(friend)
}

