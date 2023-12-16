package com.example.quick_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        val Sign_upButton2: Button = findViewById(R.id.Sign_upButton2)


        Sign_upButton2.setOnClickListener {
            // Handle sign up button click
            val intent = Intent(this@sign_up, MainActivity::class.java)
            startActivity(intent)
        }
    }
}