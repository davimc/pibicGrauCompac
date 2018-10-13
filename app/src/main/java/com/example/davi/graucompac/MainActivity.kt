package com.example.davi.graucompac

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import layout.Regras
import kotlin.NullPointerException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(view: View){
        var  r = Regras()
        var aviso =  findViewById(R.id.txtWarn) as TextView
        try {
            var u: String = editUmidade.text.toString()
            //var c: String? = editCapsula.text.toString()
            //preciso utilizar bd pra usar Cápsula
            var t: String = editTara.text.toString()
            var s = editSeca.text.toString()

            var agua = u.toDouble() - s.toDouble()
            var seca = (s.toDouble() - t.toDouble())
            var umidadeSpeedy = agua / (seca / 100)
            textAgua.text = r.imprimiNovaFrase(textAgua.text,agua)
            textSeca.text = r.imprimiNovaFrase(textSeca.text,seca)
            textUmidade.text =r.imprimiNovaFrase(textUmidade.text,umidadeSpeedy)
            aviso.visibility = INVISIBLE

        }catch(e: NullPointerException) {
            aviso.visibility = VISIBLE
            e.printStackTrace()
        }
    }

}
