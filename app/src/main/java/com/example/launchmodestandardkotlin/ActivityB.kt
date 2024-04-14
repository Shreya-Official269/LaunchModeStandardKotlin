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

class ActivityB : AppCompatActivity() {

    lateinit var buttonB : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        Toast.makeText(this, "Activity B launched", Toast.LENGTH_SHORT).show()
        buttonB = findViewById(R.id.buttonB)

        buttonB.setOnClickListener {
            val nextActivityIntent = Intent(this@ActivityB, ActivityC::class.java)
            startActivity(nextActivityIntent)
        }
    }
}