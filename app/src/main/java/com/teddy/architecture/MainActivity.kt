package com.teddy.architecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.teddy.architecture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var countViewModel: CountViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        countViewModel = ViewModelProvider(this,CountViewModel.Factory(application)).get(CountViewModel::class.java)
        countViewModel.getAll().observe(this, Observer<List<Count>>{
            // Update UI
            Toast.makeText(this.applicationContext,"Data changed",Toast.LENGTH_SHORT).show()
        })
        mBinding.countViewModel = countViewModel

        countViewModel.insert(1,1)
        countViewModel.insert(1,2)
    }

    fun btnClick() {
        Log.d("MainActivity","btn is clicked")
    }
}