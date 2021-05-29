package com.example.icecreampicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cookies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cookies)
        var btnprev5=findViewById<Button>(R.id.btnprev5)


        btnprev5.setOnClickListener {
            val intent5= Intent(baseContext,frenchcream::class.java)
            startActivity(intent5)
        }
    }
}