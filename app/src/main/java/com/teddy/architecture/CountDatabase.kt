package com.teddy.architecture

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Count::class], version = 1)
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
                        "count.db"
                    ).build()
                }
            }
            return instance
        }
    }
}