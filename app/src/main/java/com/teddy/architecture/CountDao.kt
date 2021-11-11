package com.teddy.architecture

import androidx.room.*

@Dao
interface CountDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(count: Count)

    @Update
    suspend fun update(count: Count)

    @Query("SELECT * FROM Count")
    suspend fun getAll() : List<Count>

    @Query("DELETE FROM Count")
    suspend fun deleteAll()
}