package com.example.day12assignment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class Option : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option)

        val android = findViewById<CardView>(R.id.android)
        val blockchain = findViewById<CardView>(R.id.blockchain)
        val web = findViewById<CardView>(R.id.web)
        val machine = findViewById<CardView>(R.id.Machine)
        val support = findViewById<Button>(R.id.button2)

        blockchain.setOnClickListener {
            val blcintent = Intent(applicationContext,Blockchain::class.java)
            startActivity(blcintent)
        }
        android.setOnClickListener {
            val andintent = Intent(applicationContext,Android::class.java)
            startActivity(andintent)
        }

        web.setOnClickListener {
            val webintent = Intent(applicationContext,Webdev::class.java)
            startActivity(webintent)
        }
        machine.setOnClickListener {
            val mintent = Intent(applicationContext,Machine::class.java)
            startActivity(mintent)
        }

        support.setOnClickListener {
            val dialintent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+"8830521244"))
            startActivity(dialintent)
        }
    }
}