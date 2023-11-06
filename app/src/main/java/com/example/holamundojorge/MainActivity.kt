package com.example.holamundojorge

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.widget.AppCompatEditText
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.holamundojorge.ui.theme.HolaMundoJorgeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.boton)
        val input = findViewById<AppCompatEditText>(R.id.input)

        boton.setOnClickListener {
            val nombre = input.text.toString()

            if(nombre.isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EMPTY_NAME", nombre)
                startActivity(intent)
            }
        }
        /*setContent {
            HolaMundoJorgeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }*/
    }
}

/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HolaMundoJorgeTheme {
        Greeting("Android")
    }
}*/

/*package com.example.holamundo_vicent // ResultActivity Van Gogh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }
}*/

/*package com.example.holamundo_vicent // MainActivity Van Gogh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var cajaTexto:com.google.android.material.textfield.TextInputEditText
    private lateinit var boton:Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun initComponents()
    {
        cajaTexto = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.input)
    }
}*/

/*<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:tools="http://schemas.android.com/tools">

<application
android:allowBackup="true"
android:dataExtractionRules="@xml/data_extraction_rules"
android:fullBackupContent="@xml/backup_rules"
android:icon="@mipmap/ic_launcher"
android:label="@string/app_name"
android:roundIcon="@mipmap/ic_launcher_round"
android:supportsRtl="true"
android:theme="@style/Theme.HolamundoVicent"
tools:targetApi="31">
<activity
android:name=".ResultActivity"
android:exported="false" />
<activity
android:name=".MainActivity"
android:exported="false" />
</application>

</manifest>*/