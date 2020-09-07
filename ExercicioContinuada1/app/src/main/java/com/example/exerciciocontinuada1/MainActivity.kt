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
    //Toast.makeText(
    // this,
    // "Um nome possui pelo menos 3 letras, #NãoQueroApelidos",
    // Toast.LENGTH_SHORT
    // ).show()

   // Toast.makeText(
    //this,
   // "Você só pode ser um fantasma, digite um ano com mais de 4 digitos",
   // Toast.LENGTH_SHORT
    //).show()

    //Toast.makeText(
    //this,
    //"Você é Abraão? Por favor digite sua idade novamente..",
    //Toast.LENGTH_SHORT
    //).show()

    fun validaName(): Boolean {
        val nome = et_nome.text.toString().toString()
        var correto = true

        if (et_nome.length() <= 2) {
            et_nome.error = "Um nome possui pelo menos 3 letras, #NãoQueroApelidos"
            correto = false
            return correto
        }
        return correto
    }

    fun validarAno(): Boolean{
        val ano = et_ano.text.toString().toInt()
        var correto = true

        if (et_ano.length() <= 3 || et_ano.length() > 4) {
           et_ano.error ="Você só pode ser um fantasma, digite um ano com mais de 4 digitos"
            correto = false
            return correto
        }
        return correto
    }

    fun validarIdade() :Boolean{
        val idade = et_idade.text.toString().toInt()
        var correto = true

        if(et_idade.length() >= 4){
            et_idade.error = "Você é Abraão? Por favor digite sua idade novamente.."
            correto = false
            return correto
        }
        return correto
    }


    fun botao(componente:View) {

        if (validaName() || validarAno() || validarIdade()) {
            val idade = et_idade.text.toString().toInt()
            val ano = et_ano.text.toString().toInt()
            val nome = et_nome.text.toString().toString()

            val resultado = ano - idade

            if (resultado <= 1999) {
                tv_resultado.text = "$nome o ano que você nasceu foi $resultado . TEMPO DA PEDRA!"
                tv_resultado.setTextColor(Color.GRAY)

            } else if (resultado > 2000) {
                tv_resultado.text = "$nome você nasceu no ano $resultado . ERA DA TECNOLOGIA!"
                tv_resultado.setTextColor(Color.BLUE)
            }

        }
    }

}