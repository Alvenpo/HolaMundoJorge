package com.example.holamundojorge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val saludo = findViewById<TextView>(R.id.saludo)
        val nombre: String = intent.extras?.getString("EMPTY_NAME").orEmpty()
        saludo.text = "¡Hola $nombre!"
    }
}