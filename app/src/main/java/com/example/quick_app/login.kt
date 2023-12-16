// src/main/java/com/example/quick_app/LoginActivity.kt

package com.example.quick_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val loginButton: Button = findViewById(R.id.loginButton)
        val signUpButton: Button = findViewById(R.id.Sign_UPButton)

        loginButton.setOnClickListener {
            // Handle login button click
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        }

        signUpButton.setOnClickListener {
            // Handle sign up button click
            val intent = Intent(this@LoginActivity, sign_up::class.java)
            startActivity(intent)
        }
    }
}
