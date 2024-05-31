package com.example.inventory.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update


@Dao
interface ItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    @Update
    suspend fun update(item: Item)
}