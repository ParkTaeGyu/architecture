package com.teddy.architecture

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CountDao {

    @Insert
    suspend fun addCountDb(counts: List<Count>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(count: Count)

    @Delete
    suspend fun delete(count: Count)

    @Update
    suspend fun update(count: Count)

    @Query("SELECT * FROM Count LIMIT :limit")
    suspend fun getCountByLimit(limit: Int): Count

    @Query("SELECT * FROM Count")
    fun getAll() : LiveData<MutableList<Count>>

    @Query("DELETE FROM Count")
    suspend fun deleteAll()
}