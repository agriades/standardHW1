package com.standard.hw1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

        val loginButton = findViewById<TextView>(R.id.btn_sign_in)
        loginButton.setOnClickListener {
            finish()
        }

    }
}