package com.example.exerciciocontinuada1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun botao(componente:View){     

        val idade = et_idade.text.toString().toInt()
        val ano = et_ano.text.toString().toInt()
        val nome = et_nome.text.toString().toString()

        val resultado = ano - idade

        if (et_nome.length() < 2){
            Toast.makeText(
                this,
                "Um nome possui pelo menos 3 letras, #NãoQueroApelidos",
                Toast.LENGTH_SHORT
            ).show()
        }

        if (et_ano.length() < 3 || et_ano.length() > 4) {
            Toast.makeText(
                this,
                "Você só pode ser um fantasma, digite um ano com mais de 4 digitos",
                Toast.LENGTH_SHORT
            ).show()
        }

        if (et_idade.length() < 0 || et_idade.length() > 300)
            Toast.makeText(
                this,
                "Ou você é um bb na barriga da mamãe, ou você é Abraão! Por favor digite sua idade novamente..",
                Toast.LENGTH_SHORT
            ).show()

        if (resultado <= 1999){
            tv_resultado.text = "$nome o ano que você nasceu foi $resultado . TEMPO DA PEDRA!"
            tv_resultado.setTextColor(Color.GRAY)

        }else if(resultado > 2000){
            tv_resultado.text = "$nome você nasceu no ano $resultado . ERA DA TECNOLOGIA!"
            tv_resultado.setTextColor(Color.BLUE)
        }

        }

}