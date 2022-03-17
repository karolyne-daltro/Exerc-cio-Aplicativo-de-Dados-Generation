package com.kord.exerccio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        buttonD6.setOnClickListener {
           rolarDados(6)
        }
        buttonD6.setOnClickListener {
            rolarDados(12)
        }
        buttonD6.setOnClickListener {
            rolarDados(20)
        }
    }
    private fun rolarDados(lados: Int) {

        val valor = (1..lados).random()

        val textResultado = findViewById<TextView>(R.id.textResultados)

        textResultado.text = valor.toString()
    }
}