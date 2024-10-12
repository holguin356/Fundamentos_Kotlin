package com.wanderapp.fundamentos_kotlin

import com.wanderapp.fundamentos_kotlin.clases.Group
import com.wanderapp.fundamentos_kotlin.clases.User

fun main(){
    newTopic("Colecciones - Listas")
    newTopic("Solo lectura")
    val fruitList = listOf("Banana", "Uva", "Sandia", "Kiwi", "uchua")
    println(fruitList.get((Math.random()*5).toInt()))
    println(fruitList.random())
    println(fruitList.get((0..fruitList.size - 1).random()))
    println(fruitList.get((fruitList.indices.random())))
    println("index de uva es ${fruitList.indexOf("uva")}")

    newTopic("Listas mutable")
    val myUser = User(0, "Sebastían","Holguin", Group.FAMILY.ordinal)
    val bro = myUser.copy(1, "David")
    val friend = bro.copy(2, group = Group.FRIEND.ordinal)

    val userList = mutableListOf(myUser, bro)
    println(userList)
    userList.add(friend)
    println(userList)
    userList.remove(bro)
    println(userList)

    val userSelectList = mutableListOf<User>()
    println(userSelectList)
    userSelectList.addAll(userList)
    println(userSelectList)
    userSelectList.set(0, bro)//sobre escribio
    println(userSelectList)
}

