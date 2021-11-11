package com.teddy.architecture

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class CountDatabase: RoomDatabase() {
    abstract fun countDao(): CountDao

    companion object{
        private var instance: CountDatabase? = null

        @Synchronized
        fun getInstance(context: Context) : CountDatabase? {
            if(instance == null){
                synchronized(CountDatabase::class){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        CountDatabase::class.java,
                        "user.db"
                    ).build()
                }
            }
            return instance
        }
    }
}