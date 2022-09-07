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

        boton.setOnClickListener {
            dado1.setImageDrawable(getDrawable(getRandomImage()))
            dado2.setImageDrawable(getDrawable(getRandomImage()))
        }

    }
    private fun aleatorio(limiteSup: Int = 0): Int{
        return (1..limiteSup).random()
    }
    private fun getRandomImage() : Int {
        return when(aleatorio(6)){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else
                -> R.drawable.empty_dice
        }
    }
}