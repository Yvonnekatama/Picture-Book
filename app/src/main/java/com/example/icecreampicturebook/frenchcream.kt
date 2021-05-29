package com.example.icecreampicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class frenchcream : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frenchcream)
        var btnnextpage=findViewById<Button>(R.id.btnnextpage)
        var btnprevpage=findViewById<Button>(R.id.btnprevpage)

        btnnextpage.setOnClickListener {
            val intent3= Intent(baseContext,cookies::class.java)
            startActivity(intent3)
        }
        btnprevpage.setOnClickListener {
            val intent4= Intent(baseContext,ubecream::class.java)
            startActivity(intent4)
        }
    }
}