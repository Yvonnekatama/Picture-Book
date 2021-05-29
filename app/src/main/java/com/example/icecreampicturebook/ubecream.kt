package com.example.icecreampicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ubecream : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ubecream)
        var btnnextal=findViewById<Button>(R.id.btnnextal)
        var btnprev=findViewById<Button>(R.id.btnprevv)

        btnnextal.setOnClickListener {
            val intent3= Intent(baseContext,frenchcream::class.java)
            startActivity(intent3)
        }
        btnprev.setOnClickListener {
            val intent4= Intent(baseContext,MainActivity::class.java)
            startActivity(intent4)
        }
    }
}