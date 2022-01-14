package com.example.android.sampleintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    companion object{
        val TAG = "Extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        val sendIntentButton: Button = findViewById(R.id.button)
//
//        sendIntentButton.setOnClickListener {
//            val intent = Intent(this, MainActivity2::class.java)
//            intent.putExtra(TAG, "This is passed intent!")
//            startActivity(intent)
//        }

    }
}