package com.example.ejer8

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnViAct: Button = findViewById(R.id.btnViAct)
        btnViAct.setOnClickListener{

            val intent = Intent(this, videoActivity::class.java)
            startActivity(intent)
        }


        val btnAuAct: Button = findViewById(R.id.btnAuAct)
        btnAuAct.setOnClickListener{

            val intent = Intent(this, audioActivity::class.java)
            startActivity(intent)

        }

    }
}