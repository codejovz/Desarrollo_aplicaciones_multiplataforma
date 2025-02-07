package com.example.video10

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.video10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val et1: EditText =findViewById(R.id.et1)

        val btn1: Button =findViewById(R.id.btn1)
        val tv1: TextView =findViewById(R.id.tv1)
        val btnPlus:Button = findViewById(R.id.btnPlus)
        val btnMinus:Button = findViewById(R.id.btnMinus)

        btn1.setOnClickListener {
            var numero=et1.text.toString().toIntOrNull()

            /*if(numero==null) tv1.text="Introduce algo, hombre!"
            else if(numero<18) tv1.text="Eres menor de edad"

            else if(numero>18) tv1.text="Eres mayor de edad"

            else tv1.text="Tienes justo 18 años"*/

            tv1.text=if(numero==null) "Introduce algo, hombre!!!"

            else if(numero<18) "Eres menor de edad"

            else if(numero>18) "Eres mayor de edad"

            else "Tienes justo 18 años"
        }

        btnPlus.setOnClickListener{

            var numero=et1.text.toString().toIntOrNull()

            if(numero==null) tv1.text="Introduce algo, hombre!"

            else et1.setText((++numero).toString())

        }

        btnMinus.setOnClickListener{

            var numero=et1.text.toString().toIntOrNull()

            if(numero==null) tv1.text="Introduce algo, hombre!"

            else et1.setText((--numero).toString())

        }
    }
}