package com.teddy.architecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.btn_hello_world)

        textView.setOnClickListener {
            //TODO(디비에서 텍스트값 변경^^)
            textView.text = "Button was Clicked"
        }
    }
}