package com.teddy.architecture

import android.widget.Button

class ViewModel(activity: MainActivity) {
    private var activity: MainActivity = activity
    private lateinit var button: Button
    init {
        initView()
    }

    fun initView() {
        button = activity.findViewById(R.id.btn_hello_world)
        button.setOnClickListener {
            button.text = Model().onButtonClicked()
        }
    }
}