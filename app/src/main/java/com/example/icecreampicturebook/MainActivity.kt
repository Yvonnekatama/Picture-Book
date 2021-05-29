package com.example.icecreampicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnnext=findViewById<Button>(R.id.btnnext)

        btnnext.setOnClickListener {
            val intent=Intent(baseContext,ubecream::class.java)
            startActivity(intent)

        }
    }
}