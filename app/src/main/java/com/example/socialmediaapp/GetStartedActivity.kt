package com.example.socialmediaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GetStartedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_get_started)


        val btn : Button = findViewById(R.id.btnGet)

        val intent = Intent (this, SignInActivity::class.java)
        btn.setOnClickListener {

//            Ahmed zanaty

            startActivity(intent)
        }
    }
}