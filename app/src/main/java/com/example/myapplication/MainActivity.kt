package com.example.myapplication

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi


class MainActivity : AppCompatActivity() {
//    should things be done this way?
    private lateinit var  loginButton: Button
//    Button loginButton

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginButton = findViewById(R.id.loginBTN)

        loginButton.setOnClickListener(){
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }


    }




}