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

class ActivityC : AppCompatActivity() {

    lateinit var buttonC : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        Toast.makeText(this, "Activity C launched", Toast.LENGTH_SHORT).show()
        buttonC = findViewById(R.id.buttonC)

        buttonC.setOnClickListener {
            val nextActivityIntent = Intent(this@ActivityC, ActivityD::class.java)
            startActivity(nextActivityIntent)
        }
        }
    }
