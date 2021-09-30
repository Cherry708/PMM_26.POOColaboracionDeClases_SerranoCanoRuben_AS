package com.example.pmm_26poocolaboraciondeclases_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Problema3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema3)

        val tvResult = findViewById<TextView>(R.id.tvResult30)
        val btnEnter = findViewById<Button>(R.id.btnEnter30)

        val socio0 = Socio("John", 0)
        val socio1 = Socio("Dave",1)
        val socio2 = Socio("Jane", 3)

        val listaSocios = arrayListOf<Socio>()
        listaSocios.add(socio0)
        listaSocios.add(socio1)
        listaSocios.add(socio2)
        val club = Club(listaSocios)

        btnEnter.setOnClickListener {
            tvResult.text = club.socioAntiguo().toString()
        }
    }
}