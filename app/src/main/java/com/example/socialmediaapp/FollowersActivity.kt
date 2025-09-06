package com.example.socialmediaapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FollowersActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_followers)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


//        val followBtn = findViewById<Button>(R.id.btnFollow)
//
//        followBtn.setOnClickListener {
//
//            val isFollowing = false
//
//            if (isFollowing) {
//                // لو كان عامل فولو
//                followBtn.text = "Follow"
//                followBtn.setTextColor(Color.WHITE)
//                followBtn.setBackgroundColor(Color.parseColor("#4CAF50")) // أخضر
//            } else {
//                // لو لسه معملش فولو
//                followBtn.text = "Following"
//                followBtn.setTextColor(Color.BLACK)
//                followBtn.textSize = 12f
//                followBtn.setBackgroundColor(Color.WHITE)
//            }
//        }



    }
}