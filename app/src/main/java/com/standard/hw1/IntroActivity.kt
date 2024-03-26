package com.standard.hw1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_intro)

        val toLoginBtn = findViewById<TextView>(R.id.tv_intro_signin)
        val toRegisterBtn = findViewById<TextView>(R.id.tv_intro_register)

        toLoginBtn.setOnClickListener {
            val toLoginIntent = Intent(this, LoginActivity::class.java)
            startActivity(toLoginIntent)
        }

        toRegisterBtn.setOnClickListener {
            val myToast = Toast.makeText(this.applicationContext, "계정 등록 준비중!", Toast.LENGTH_SHORT)
            myToast.show()
        }

    }
}