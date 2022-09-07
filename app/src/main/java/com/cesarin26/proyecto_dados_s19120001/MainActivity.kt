package com.cesarin26.proyecto_dados_s19120001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var boton: Button
    lateinit var dado1:ImageView
    lateinit var dado2:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_dados)
        boton=findViewById(R.id.btnClick)
        dado1=findViewById(R.id.imgDado1)
        dado2=findViewById(R.id.imgDado2)
        //Prueba de cambios
    }
    fun aleatorio(par: Int = 0): Int{
        return (0..par).random()
    }
}