package com.keertana.volley.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.keertana.volley.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnUser.setOnClickListener {
            if (et_email.text.trim().isNotEmpty() || et_password.text.trim().isNotEmpty()){
                Toast.makeText(this,"Input Provided", Toast.LENGTH_SHORT).show()
                Intent(this@MainActivity,UserActivity::class.java).also {
                    startActivity(it)
                }
            }
            else
            {
                Toast.makeText(this,"Input required", Toast.LENGTH_SHORT).show()
            }
        }

    }
}