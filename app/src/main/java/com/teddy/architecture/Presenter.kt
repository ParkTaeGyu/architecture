package com.teddy.architecture

interface Presenter {
    fun updateDataFromModel()
    interface ButtonView{
        fun setText(text: String)
    }
}