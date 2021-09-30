package com.example.pmm_26poocolaboraciondeclases_serranocanoruben_as

import kotlin.random.Random

class Dado {
    var valor = ((0..6).random())

    fun tirar():Int{
        valor = ((0..6).random())
        return this.valor
    }

    fun imprimir():String{
        return "El valor del dado es $valor"
    }

}