package com.teddy.architecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(),Presenter.ButtonView {
    private lateinit var button: Button
    private lateinit var presenter: Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.btn_hello_world)

        presenter = PresenterImpl(this@MainActivity)
        button.setOnClickListener {
            presenter.updateDataFromModel()
        }
    }

    override fun setText(text: String) {
        button.text = text
    }
}