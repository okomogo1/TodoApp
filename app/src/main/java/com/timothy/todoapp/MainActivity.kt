package com.timothy.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val validUsername ="admin"
    val validPassword = "admin"
    private lateinit var usernameinput: EditText
    private lateinit var passwordinput: EditText
    private lateinit var submitbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameinput = findViewById (R.id.usernameinput)
        passwordinput = findViewById(R.id.Passwordinput)
        submitbutton = findViewById(R.id.submitbutton)

        submitbutton.setOnClickListener {
            val username = usernameinput.text.toString()
            val password = passwordinput.text.toString()
            login(username, password)
        }

    }
    private fun login(username:String, password:String) {
        if (isValidCredentials(username, password)) {
            val intent: Intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("name", username)
            startActivity(intent)
        }else
            Toast.makeText(applicationContext,"Login Unsuccessful", Toast.LENGTH_SHORT)
                .show()
    }
    private fun isValidCredentials( username:String, password: String):Boolean{
        if (username==validUsername && password ==validPassword)return true
        return false
    }
}