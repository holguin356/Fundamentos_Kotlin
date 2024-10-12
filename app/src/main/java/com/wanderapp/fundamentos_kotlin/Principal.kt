package com.wanderapp.fundamentos_kotlin

fun main() {

    /*
    * Var permite la edición de los datos
    * Val actua como una constante
    * */
    newTopic("tipos de variables")
    val e: Int //constante
    var f: Int //modificar
    val objNulo: String?
    objNulo = null

    var objAny: Any?
    objAny = ""
    objAny = 88
    objAny = null
}

fun newTopic(topic: String){
    print("\n==================== $topic ====================\n")

}