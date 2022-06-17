package com.keertana.volley.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.keertana.volley.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnUser.setOnClickListener {
            Intent(this@MainActivity,UserActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}