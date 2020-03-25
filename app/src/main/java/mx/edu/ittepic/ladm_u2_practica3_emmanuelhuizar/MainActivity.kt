package mx.edu.ittepic.ladm_u2_practica3_emmanuelhuizar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var pause=true
    var pause2=false
    var pause3=false
    var pause4=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            button.setEnabled(false)
            textView105.setText("Ganador")
            textView108.setText("Esperando...")
            var hilo=Hilo1(this)
            var hilo2=Hilo2(this)
            var hilo3=Hilo3(this)
            var hilo4=Hilo4(this)

            hilo.start()
            hilo2.start()
            hilo3.start()
            hilo4.start()
        }
    }
    fun NumDado() {
        textView107.setText((1..6).shuffled().first().toString())
        textView109.setText((1..6).shuffled().first().toString())
    }

    fun suma(Nombre:TextView,Nombre2:TextView,Resultado:TextView){
        Resultado.setText((Nombre.text.toString().toInt() + Nombre2.text.toString().toInt()).toString())
    }

    fun total(n1:TextView,n2:TextView,n3:TextView,n4:TextView,R:TextView){
        R.setText((n1.text.toString().toInt() + n2.text.toString().toInt()+n3.text.toString().toInt() + n4.text.toString().toInt()).toString())
    }
}

class Hilo1(p:MainActivity) : Thread(){
    var puntero=p
    var llenarJ1=0
    override fun run() {
        super.run()
        while(true){
            sleep(1000)
            if(puntero.pause) {

                puntero.runOnUiThread {
                    puntero.textView79.setText("Esperando")
                    puntero.textView21.setText("Jugando")
                    when (llenarJ1) {
                        1 -> {
                            puntero.NumDado()
                            puntero.textView26.setText(puntero.textView107.text.toString())
                            puntero.textView27.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView26,puntero.textView27,puntero.textView25)
                            puntero.total(puntero.textView25,puntero.textView41,puntero.textView42,puntero.textView43,puntero.textView44)
                            puntero.pause=false
                            puntero.pause2=true
                        }
                        2 -> {
                            puntero.NumDado()
                            puntero.textView30.setText(puntero.textView107.text.toString())
                            puntero.textView31.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView30,puntero.textView31,puntero.textView41)
                            puntero.total(puntero.textView25,puntero.textView41,puntero.textView42,puntero.textView43,puntero.textView44)
                            puntero.pause=false
                            puntero.pause2=true
                        }
                        3 -> {
                            puntero.NumDado()
                            puntero.textView33.setText(puntero.textView107.text.toString())
                            puntero.textView34.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView33,puntero.textView34,puntero.textView42)
                            puntero.total(puntero.textView25,puntero.textView41,puntero.textView42,puntero.textView43,puntero.textView44)
                            puntero.pause=false
                            puntero.pause2=true
                        }
                        4 -> {
                            puntero.NumDado()
                            puntero.textView36.setText(puntero.textView107.text.toString())
                            puntero.textView37.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView36,puntero.textView37,puntero.textView43)
                            puntero.total(puntero.textView25,puntero.textView41,puntero.textView42,puntero.textView43,puntero.textView44)
                            puntero.pause=false
                            puntero.pause2=true
                        }
                    }
                }
                llenarJ1++
            }
        }
    }
}

class Hilo2(p:MainActivity) : Thread(){
    var puntero=p
    var llenarJ1=0
    override fun run() {
        super.run()
        while(true){
            sleep(1000)
            if(puntero.pause2) {
                puntero.runOnUiThread {
                    puntero.textView21.setText("Esperando")
                    puntero.textView1.setText("Jugando")
                    when (llenarJ1) {
                        1 -> {
                            puntero.NumDado()
                            puntero.textView6.setText(puntero.textView107.text.toString())
                            puntero.textView7.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView6,puntero.textView7,puntero.textView5)
                            puntero.total(puntero.textView5,puntero.textView14,puntero.textView18,puntero.textView51,puntero.textView50)
                            puntero.pause2=false
                            puntero.pause3=true
                        }
                        2 -> {
                            puntero.NumDado()
                            puntero.textView12.setText(puntero.textView107.text.toString())
                            puntero.textView13.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView12,puntero.textView13,puntero.textView14)
                            puntero.total(puntero.textView5,puntero.textView14,puntero.textView18,puntero.textView51,puntero.textView50)
                            puntero.pause2=false
                            puntero.pause3=true
                        }
                        3 -> {
                            puntero.NumDado()
                            puntero.textView16.setText(puntero.textView107.text.toString())
                            puntero.textView17.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView16,puntero.textView17,puntero.textView18)
                            puntero.total(puntero.textView5,puntero.textView14,puntero.textView18,puntero.textView51,puntero.textView50)
                            puntero.pause2=false
                            puntero.pause3=true
                        }
                        4 -> {
                            puntero.NumDado()
                            puntero.textView46.setText(puntero.textView107.text.toString())
                            puntero.textView52.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView36,puntero.textView37,puntero.textView51)
                            puntero.total(puntero.textView5,puntero.textView14,puntero.textView18,puntero.textView51,puntero.textView50)
                            puntero.pause2=false
                            puntero.pause3=true
                        }
                    }
                }
                llenarJ1++
            }
        }
    }
}

class Hilo3(p:MainActivity) : Thread(){
    var puntero=p
    var llenarJ1=0
    override fun run() {
        super.run()
        while(true){
            sleep(1000)
            if(puntero.pause3) {
                puntero.runOnUiThread {
                    puntero.textView1.setText("Esperando")
                    puntero.textView53.setText("Jugando")
                    when (llenarJ1) {
                        1 -> {
                            puntero.NumDado()
                            puntero.textView59.setText(puntero.textView107.text.toString())
                            puntero.textView60.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView60,puntero.textView59,puntero.textView61)
                            puntero.total(puntero.textView61,puntero.textView65,puntero.textView69,puntero.textView76,puntero.textView77)
                            puntero.pause3=false
                            puntero.pause4=true
                        }
                        2 -> {
                            puntero.NumDado()
                            puntero.textView63.setText(puntero.textView107.text.toString())
                            puntero.textView64.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView63,puntero.textView64,puntero.textView65)
                            puntero.total(puntero.textView61,puntero.textView65,puntero.textView69,puntero.textView76,puntero.textView77)
                            puntero.pause3=false
                            puntero.pause4=true
                        }
                        3 -> {
                            puntero.NumDado()
                            puntero.textView67.setText(puntero.textView107.text.toString())
                            puntero.textView68.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView67,puntero.textView68,puntero.textView69)
                            puntero.total(puntero.textView61,puntero.textView65,puntero.textView69,puntero.textView76,puntero.textView77)
                            puntero.pause3=false
                            puntero.pause4=true

                        }
                        4 -> {
                            puntero.NumDado()
                            puntero.textView71.setText(puntero.textView107.text.toString())
                            puntero.textView72.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView71,puntero.textView72,puntero.textView76)
                            puntero.total(puntero.textView61,puntero.textView65,puntero.textView69,puntero.textView76,puntero.textView77)
                            puntero.pause3=false
                            puntero.pause4=true
                        }
                    }
                }
                llenarJ1++
            }
        }
    }
}

class Hilo4(p:MainActivity) : Thread(){
    var puntero=p
    var llenarJ1=0
    override fun run() {
        super.run()
        while(true){
            sleep(1000)
            if(puntero.pause4) {
                puntero.runOnUiThread {
                    puntero.textView53.setText("Esperando")
                    puntero.textView79.setText("Jugando")
                    when (llenarJ1) {
                        1 -> {

                            puntero.NumDado()
                            puntero.textView87.setText(puntero.textView107.text.toString())
                            puntero.textView85.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView87,puntero.textView85,puntero.textView86)
                            puntero.total(puntero.textView86,puntero.textView91,puntero.textView95,puntero.textView99,puntero.textView103)
                            puntero.pause4=false
                            puntero.pause=true
                        }
                        2 -> {
                            puntero.NumDado()
                            puntero.textView89.setText(puntero.textView107.text.toString())
                            puntero.textView90.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView89,puntero.textView90,puntero.textView91)
                            puntero.total(puntero.textView86,puntero.textView91,puntero.textView95,puntero.textView99,puntero.textView103)
                            puntero.pause4=false
                            puntero.pause=true
                        }
                        3 -> {
                            puntero.NumDado()
                            puntero.textView93.setText(puntero.textView107.text.toString())
                            puntero.textView94.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView93,puntero.textView94,puntero.textView95)
                            puntero.total(puntero.textView86,puntero.textView91,puntero.textView95,puntero.textView99,puntero.textView103)
                            puntero.pause4=false
                            puntero.pause=true
                        }
                        4 -> {
                            puntero.NumDado()
                            puntero.textView97.setText(puntero.textView107.text.toString())
                            puntero.textView98.setText(puntero.textView109.text.toString())
                            puntero.suma(puntero.textView97,puntero.textView98,puntero.textView99)
                            puntero.total(puntero.textView86,puntero.textView91,puntero.textView95,puntero.textView99,puntero.textView103)
                            puntero.pause4=false
                            //445077103
                            var Ganador = ArrayList<Int>()
                            Ganador.add(puntero.textView44.text.toString().toInt())
                            Ganador.add(puntero.textView50.text.toString().toInt())
                            Ganador.add(puntero.textView77.text.toString().toInt())
                            Ganador.add(puntero.textView103.text.toString().toInt())
                            puntero.textView79.setText("Esperando")
                            (0..3).forEach {
                                if (Ganador[it] == Ganador.max()) {
                                    puntero.textView108.setText("Jugador ${it+1}")
                                }
                            }
                        }
                    }
                }
                llenarJ1++
            }
        }
    }
}


