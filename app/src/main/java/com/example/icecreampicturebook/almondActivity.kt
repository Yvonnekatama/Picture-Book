package com.example.icecreampicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class almondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almond)
        var btnnext3=findViewById<Button>(R.id.btnnext3)
        var btnprev=findViewById<Button>(R.id.btnprevious)

        btnnext3.setOnClickListener {
            val intent3= Intent(baseContext,frenchcream::class.java)
            startActivity(intent3)
        }
        btnprev.setOnClickListener {
            val intent4= Intent(baseContext,ubecream::class.java)
            startActivity(intent4)
        }
    }
}