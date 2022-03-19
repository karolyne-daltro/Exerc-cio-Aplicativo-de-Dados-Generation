package com.kord.exerccio

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)


        val resultado = intent.getIntExtra("RESULTADO", 0)

        val textDados = findViewById<TextView>(R.id.textDados)

        textDados.text = "Resultado: $resultado"
    }
}