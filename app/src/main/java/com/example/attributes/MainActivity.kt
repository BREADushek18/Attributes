package com.example.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val buttonBlackText = findViewById<Button>(R.id.button_blackText)
        val buttonRedText = findViewById<Button>(R.id.button_redText)
        val button8SP = findViewById<Button>(R.id.button8SP)
        val button24SP = findViewById<Button>(R.id.button24SP)
        val buttonWhiteBack = findViewById<Button>(R.id.button_whiteBack)
        val buttonYellowBack = findViewById<Button>(R.id.button_yellowBack)

        buttonBlackText.setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }
        buttonRedText.setOnClickListener {
            editText.setTextColor(Color.RED)
        }
        button8SP.setOnClickListener {
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8f)
        }
        button24SP.setOnClickListener {
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
        }
        buttonWhiteBack.setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }
        buttonYellowBack.setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}