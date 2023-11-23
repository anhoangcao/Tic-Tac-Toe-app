package com.example.b2003774_caohoangan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPlay: Button = findViewById(R.id.buttonPlay)
        buttonPlay.setOnClickListener {
            val intent = Intent(this@MainActivity, PlayGameActivity::class.java)
            startActivity(intent)
            finish()
        }

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            finish()
        }
    }
}