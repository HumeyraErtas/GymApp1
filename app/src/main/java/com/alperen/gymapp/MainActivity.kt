package com.alperen.gymapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show()

        val btnAlert = findViewById<Button>(R.id.btnAlert)

        btnAlert.setOnClickListener {
            val intent = Intent(this,NotificationActivity::class.java)
            startActivity(intent)
        }
    }
}