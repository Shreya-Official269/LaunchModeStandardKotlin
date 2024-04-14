package com.example.launchmodestandardkotlin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityD : AppCompatActivity() {

    lateinit var buttonD1 : Button
    lateinit var buttonD2 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)

        Toast.makeText(this, "Activity D launched", Toast.LENGTH_SHORT).show()
        buttonD1 = findViewById(R.id.buttonD1)
        buttonD2 = findViewById(R.id.buttonD2)

        buttonD1.setOnClickListener {
            val nextActivityIntent = Intent(this@ActivityD, ActivityA::class.java)
            startActivity(nextActivityIntent)
        }

        buttonD2.setOnClickListener {
            val nextActivityIntent = Intent(this@ActivityD, ActivityD::class.java)
            startActivity(nextActivityIntent)

        }

    }
}