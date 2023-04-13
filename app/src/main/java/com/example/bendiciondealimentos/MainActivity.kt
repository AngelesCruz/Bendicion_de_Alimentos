package com.example.bendiciondealimentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var blessingsList: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar vistas y lista de bendiciones
        textView = findViewById(R.id.textView)
        blessingsList = ArrayList()
        blessingsList.add(getString(R.string.blessing1))
        blessingsList.add(getString(R.string.blessing2))
        blessingsList.add(getString(R.string.blessing3))
        blessingsList.add(getString(R.string.blessing4))
        blessingsList.add(getString(R.string.blessing5))
        blessingsList.add(getString(R.string.blessing6))
        blessingsList.add(getString(R.string.blessing7))
        blessingsList.add(getString(R.string.blessing8))
        blessingsList.add(getString(R.string.blessing9))
        blessingsList.add(getString(R.string.blessing10))
        blessingsList.add(getString(R.string.blessing11))
        blessingsList.add(getString(R.string.blessing12))
        blessingsList.add(getString(R.string.blessing13))
        blessingsList.add(getString(R.string.blessing14))
        blessingsList.add(getString(R.string.blessing15))
        blessingsList.add(getString(R.string.blessing16))
        blessingsList.add(getString(R.string.blessing17))
        blessingsList.add(getString(R.string.blessing18))
        blessingsList.add(getString(R.string.blessing19))
        blessingsList.add(getString(R.string.blessing20))
        blessingsList.add(getString(R.string.blessing21))
        blessingsList.add(getString(R.string.blessing22))
        blessingsList.add(getString(R.string.blessing23))
        blessingsList.add(getString(R.string.blessing24))
        blessingsList.add(getString(R.string.blessing25))
        blessingsList.add(getString(R.string.blessing26))
        blessingsList.add(getString(R.string.blessing27))
        blessingsList.add(getString(R.string.blessing28))
        blessingsList.add(getString(R.string.blessing29))
        blessingsList.add(getString(R.string.blessing30))

        // Mostrar bendición aleatoria al abrir la aplicación
        showRandomBlessing()

    }


    private fun showRandomBlessing() {
        // Seleccionar bendición aleatoria de la lista
        val random = Random()
        val index = random.nextInt(blessingsList.size)
        val blessing = blessingsList[index]

        // Mostrar bendición en el TextView
        textView.text = blessing
    }
}