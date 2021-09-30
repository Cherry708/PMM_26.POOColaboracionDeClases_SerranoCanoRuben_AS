package com.example.pmm_26poocolaboraciondeclases_serranocanoruben_as

class Cliente(var nombre:String,var monto:Double) {

    fun depositar(deposito:Double){
        this.monto += deposito
    }

    fun extraer(retiro:Double){
        this.monto -= retiro
    }

    override fun toString():String{
        return "Cliente, nombre: $nombre, fondos: $monto"
    }
}