package com.teddy.architecture

import android.view.View

class PresenterImpl: Presenter {
    private var button: Presenter.ButtonView
    private var model: Model

    constructor(view: Presenter.ButtonView){
        this.button = view
        this.model = Model()
    }
    override fun updateDataFromModel() {
        button.setText(model.onButtonClicked())
    }
}