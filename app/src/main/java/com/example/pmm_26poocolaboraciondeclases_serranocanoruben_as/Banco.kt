package com.example.pmm_26poocolaboraciondeclases_serranocanoruben_as

class Banco(var clientes: ArrayList<Cliente>) {

    fun depositar(index:Int, deposito:Double){
        this.clientes.get(index).depositar(deposito)

    }

    fun retirar(index:Int, retiro:Double){
        this.clientes.get(index).extraer(retiro)
    }

    fun anadirCliente(cliente:Cliente){
        this.clientes.add(cliente)
    }

    fun depositosTotales():Double{
        var montoTotal = 0.0
        for(cliente in this.clientes)
            montoTotal += cliente.monto
        return montoTotal
    }


}