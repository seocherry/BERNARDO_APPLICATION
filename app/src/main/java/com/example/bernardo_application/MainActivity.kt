package com.example.bernardo_application

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.bernardo_application.ui.theme.BERNARDO_APPLICATIONTheme

class MainActivity() : ComponentActivity() {
    //this line of codes are for declaring the variables for username, pass, and login btn
    lateinit var usernameInput: EditText
    lateinit var passwordInput: EditText
    lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//this is the codes for getting the user input from the file activity_main.xml
        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)
//while this code enables to save the login info of the user in the logcat
        loginBtn.setOnClickListener{
            val username = usernameInput.text.toString()
            val password= passwordInput.text.toString()
            Log.i("Test Credentials", "Username: $username and Password: $password")
        }
    }
}