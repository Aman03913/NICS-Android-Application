package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class signIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in2)
        val btntosignup=findViewById<TextView>(R.id.btntosignUp)

        btntosignup.setOnClickListener {
            intent= Intent(applicationContext,signUp::class.java)
            startActivity(intent)


        }
    }
}