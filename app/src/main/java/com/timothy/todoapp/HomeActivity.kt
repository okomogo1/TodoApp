package com.timothy.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private lateinit var usernamedisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernamedisplay = findViewById(R.id.usernamedisplay)
        usernamedisplay.text = "Welcome to, ${intent.getStringExtra("name")} Dashboard"


    }
}