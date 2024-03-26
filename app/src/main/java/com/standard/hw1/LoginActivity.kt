package com.standard.hw1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

        val useridLoginBtn = findViewById<TextView>(R.id.tv_login_via_userid)
        val pwFindBtn = findViewById<TextView>(R.id.tv_login_find_pw)
        val googleLoginBtn = findViewById<ImageView>(R.id.iv_login_via_google)
        val facebookLoginBtn = findViewById<ImageView>(R.id.iv_login_via_facebook)
        val appleLoginBtn = findViewById<ImageView>(R.id.iv_login_via_apple)

        useridLoginBtn.setOnClickListener {
            val myToast = Toast.makeText(this.applicationContext, "로그인 기능 준비중!", Toast.LENGTH_SHORT)
            myToast.show()
        }
        pwFindBtn.setOnClickListener {
            val myToast = Toast.makeText(this.applicationContext, "비밀번호 찾기 기능 준비중!", Toast.LENGTH_SHORT)
            myToast.show()
        }
        googleLoginBtn.setOnClickListener {
            val myToast = Toast.makeText(this.applicationContext, "구글 계정 연동 준비중!", Toast.LENGTH_SHORT)
            myToast.show()
        }
        facebookLoginBtn.setOnClickListener {
            val myToast = Toast.makeText(this.applicationContext, "페이스북 계정 연동 준비중!", Toast.LENGTH_SHORT)
            myToast.show()
        }
        appleLoginBtn.setOnClickListener {
            val myToast = Toast.makeText(this.applicationContext, "애플 계정 연동 준비중!", Toast.LENGTH_SHORT)
            myToast.show()
        }
    }
}