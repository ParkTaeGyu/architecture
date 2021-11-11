package com.teddy.architecture

import android.app.Application
import androidx.lifecycle.LiveData
import kotlinx.coroutines.*

class CountRepository(application: Application) {
    private val countDatabse = CountDatabase.getInstance(application)
    private val countDao: CountDao = countDatabse!!.countDao()

    fun getCountByLimit(limit: Int) =
        CoroutineScope(Dispatchers.IO).async {
           countDao.getCountByLimit(limit)
        }


    fun getAll() : LiveData<MutableList<Count>>{
        return countDao.getAll()
    }


    fun insert(count: Count){
        CoroutineScope(Dispatchers.IO).launch {
            countDao.insert(count)
        }
    }

    fun delete(count: Count){
        CoroutineScope(Dispatchers.IO).launch {
            countDao.delete(count)
        }
    }

    fun deleteAll(){
        CoroutineScope(Dispatchers.IO).launch {
            countDao.deleteAll()
        }
    }

    fun update(count: Count){
        CoroutineScope(Dispatchers.IO).launch {
            countDao.update(count)
        }
    }
}