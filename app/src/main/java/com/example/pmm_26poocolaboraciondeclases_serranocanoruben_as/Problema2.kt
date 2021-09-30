package com.example.pmm_26poocolaboraciondeclases_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val dado0 = Dado()
        val dado1 = Dado()
        val dado2 = Dado()

        val tvResult = findViewById<TextView>(R.id.tvResult20)

        val btnPlay = findViewById<Button>(R.id.btnPlay)
        btnPlay.setOnClickListener {
            val result = jugar(dado0,dado1,dado2)
            tvResult.text = result
        }
    }

    fun jugar(dado0: Dado, dado1: Dado,dado2: Dado):String{
        dado0.tirar()
        dado1.tirar()
        dado2.tirar()
        return when{
            dado0.valor == dado1.valor && dado1.valor == dado2.valor ->
                "Ganaste"
            else ->
                "Perdiste"
        }
    }
}