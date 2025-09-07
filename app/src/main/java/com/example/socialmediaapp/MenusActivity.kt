package com.example.socialmediaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menus)



        val btn3 : Button = findViewById(R.id.btnOut)

        val intent = Intent (this, FollowersActivity::class.java)
        btn3.setOnClickListener {
            startActivity(intent)
        }


    }
}