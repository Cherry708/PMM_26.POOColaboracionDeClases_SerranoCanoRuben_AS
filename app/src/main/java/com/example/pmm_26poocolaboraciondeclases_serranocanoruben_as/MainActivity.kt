package com.example.pmm_26poocolaboraciondeclases_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cliente0 = Cliente("Tom",200.0)
        val cliente1 = Cliente("John", 300.0)
        val cliente3 = Cliente("Jane", 400.0)
        val listaClientes = arrayListOf<Cliente>()
        listaClientes.add(cliente0)
        listaClientes.add(cliente1)
        listaClientes.add(cliente3)
        val banco = Banco(listaClientes)

        banco.depositar(listaClientes.indexOf(cliente0), 200.0)
        banco.depositosTotales()

        val tvResult = findViewById<TextView>(R.id.tvResult10)

        val btnEnter = findViewById<Button>(R.id.btnEnter10)
        btnEnter.setOnClickListener {
            val message = "La suma de los fondos de todos los clientes es: ${banco.depositosTotales()}"
            tvResult.text = message
        }

    }
}