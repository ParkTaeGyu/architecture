package com.teddy.architecture

import android.widget.Button

class ViewModel {
    private var activity: MainActivity
    private lateinit var button: Button
    constructor(activity: MainActivity){
        this.activity = activity
        initView()
    }

    fun initView() {
        button = activity.findViewById(R.id.btn_hello_world)
        button.setOnClickListener {
            button.text = Model().onButtonClicked()
        }
    }
}