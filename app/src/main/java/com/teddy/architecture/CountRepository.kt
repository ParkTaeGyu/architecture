package com.teddy.architecture

import android.app.Application
import androidx.lifecycle.LiveData

class CountRepository(application: Application) {
//    private val countDao: CountDao
//    private val countList: LiveData<List<Count>>

    init {
        var db: CountDatabase = CountDatabase.getInstance(application)!!
    }
}