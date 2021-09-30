package com.example.pmm_26poocolaboraciondeclases_serranocanoruben_as

class Club(var listaSocios:ArrayList<Socio>) {

    fun socioAntiguo():Socio {
        var socioMasAntiguo = Socio("Ejemplo", 0)
        var antiguedadMaxima = 0
        for (socio in listaSocios){
            if (socio.antiguedad > antiguedadMaxima){
                antiguedadMaxima = socio.antiguedad
                socioMasAntiguo = socio
            }
        }
        return socioMasAntiguo
    }
}