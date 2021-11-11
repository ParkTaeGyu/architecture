package com.teddy.architecture

import android.app.Application
import android.util.Log
import android.widget.Button
import androidx.lifecycle.*

class CountViewModel(application: Application): AndroidViewModel(application) {
    private val repository = CountRepository(application)
//    private val counts = repository.getAll()

    class Factory(val application: Application) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return CountViewModel(application) as T
        }
    }

    fun getAll() : LiveData<MutableList<Count>> {
        Log.d("CountViewModel","getAll called")
        return repository.getAll()
    }

    fun getCountByLimit(limit: Int){
        repository.getCountByLimit(limit)
    }

    fun insert(count: Int,id: Int){
        Log.d("CountViewModel","${count.inc()} insert called")
        repository.insert(Count(count,id))
    }

/*    fun insertAll(countList: List<Count>){
        Log.d("CountViewModel","insertAll called")
        repository.insertAll(countList)
    }*/

    fun delete(count: Count){
        repository.delete(count)
    }

    fun deleteAll(){
        repository.deleteAll()
    }

    fun update(count: Count){
        repository.update(count)
    }
}