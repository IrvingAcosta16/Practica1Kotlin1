package com.example.practica1kotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnSaludar: Button // Declaración de variable botón "Saludar"
    private lateinit var btnLimpiar: Button // Declaración de variable botón "Limpiar"
    private lateinit var btnCerrar: Button // Declaración de variable botón "Cerrar"
    private lateinit var lblSaludar: TextView // Declaración de variable texto "lblSaludar"
    private lateinit var txtNombre: EditText // Declaración de variable de entrada de texto "txtNombre"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Cargar la actividad_main

        //Relacion de los objetos Java con las vistas xml
        btnSaludar = findViewById(R.id.btnSaludar) // Referencia del botón Saludar en el archivo XML
        btnLimpiar = findViewById(R.id.btnLimpiar) // Referencia del botón Limpiar en el archivo XML
        btnCerrar = findViewById(R.id.btnCerrar) // Referencia del botón Cerrar en el archivo XML
        lblSaludar = findViewById(R.id.lblSaludar) // Referencia del texto "lblSaludar" en el archivo XML
        txtNombre = findViewById(R.id.txtNombre) // Referencia del campo de entrada de texto "txtNombre" en el archivo XML

        //Codificar evento click boton Saludar
        btnSaludar.setOnClickListener {
            if (txtNombre.text.toString().isEmpty()) { // Si el campo de entrada de texto está vacío
                //Falta capturar el nombre
                Toast.makeText(this@MainActivity, "Favor de ingresar el nombre", Toast.LENGTH_SHORT).show() // Mostrar mensaje de advertencia
            } else { // Si el campo de entrada de texto no está vacío
                val saludar = txtNombre.text.toString() // Obtener el valor del campo de entrada de texto
                lblSaludar.text = "Hola $saludar, ¿Cómo estás?" // Establecer el valor del texto lblSaludar con un saludo personalizado
            }
        }

        //Codificar evento click boton Limpiar
        btnLimpiar.setOnClickListener {
            txtNombre.setText("") // Limpiar el campo de entrada de texto
            lblSaludar.text = "" // Limpiar el texto lblSaludar
        }

        //Codificar evento click boton Cerrar
        btnCerrar.setOnClickListener {
            finish() // Cerrar la actividad
        }
    }
}