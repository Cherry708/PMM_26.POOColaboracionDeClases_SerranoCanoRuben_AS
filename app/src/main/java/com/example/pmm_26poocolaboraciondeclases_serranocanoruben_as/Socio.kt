package com.example.pmm_26poocolaboraciondeclases_serranocanoruben_as

class Socio(var nombre:String, var antiguedad:Int) {

    override fun toString(): String {
        return "Socio $nombre, antiguedad: $antiguedad años"
    }
}