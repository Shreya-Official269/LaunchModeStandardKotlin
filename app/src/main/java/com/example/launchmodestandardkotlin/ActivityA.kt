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

class ActivityA : AppCompatActivity() {

     lateinit var buttonA : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        Toast.makeText(this, "Activity A launched", Toast.LENGTH_SHORT).show()
        buttonA = findViewById(R.id.buttonA)

        buttonA.setOnClickListener {
            val nextActivityIntent = Intent(this@ActivityA, ActivityB::class.java)
            startActivity(nextActivityIntent)

        }
        }
    }
