package com.teddy.architecture

import android.app.Application
import android.widget.Button
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class ViewModel(application: Application): AndroidViewModel(application) {
    var count = MutableLiveData<Int>()
    init {
        count.value = 0
    }

    fun increse() {
        count.value = count.value?.inc()
    }
}