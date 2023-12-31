package com.example.android_advanced

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class LoginActivity : AppCompatActivity() {

    private lateinit var prefManager: PrefManager
    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var username: String
    private lateinit var password: String

    private var validUsername = "Ardinidy"
    private var validPassword = "abc12345"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        init()
        checkLogin()
    }

    private fun init(){
        prefManager = PrefManager(this)
        etUsername = findViewById(R.id.et_username)
        etPassword = findViewById(R.id.et_password)
    }

    private fun checkLogin(){
        if (prefManager.isLogin()!!){
            val intent = Intent(this, SharedPreference::class.java)
            startActivity(intent)
            finish()
        }
    }
    fun clickLogin(view: View) {
        username = etUsername.text.toString().trim()
        password = etPassword.text.toString().trim()
        if (username.isEmpty() || username == ""){
            etUsername.error = "Wajib diisi"
            etUsername.requestFocus()
        } else if (password.isEmpty() || password == ""){
            etPassword.error = "wajib diisi"
            etPassword.requestFocus()
        } else if (username != validUsername){
            etUsername.error = "Username belum terdaftar"
            etUsername.requestFocus()
        } else if (password != validPassword){
            etPassword.error = "Password tidak valid"
            etPassword.requestFocus()
        } else {
            prefManager.setLoggin(true)
            prefManager.setUsername(username)

            val intent = Intent(this, SharedPreference::class.java)
            startActivity(intent)
            finish()
        }
    }
}