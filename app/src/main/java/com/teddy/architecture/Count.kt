package com.teddy.architecture

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Count(
    var count: Int,
){
    @PrimaryKey
    var id = 0
}