package com.example.myapplication.Roomdata

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserDao {

    @Insert

    fun insert(user: User)

    @Query("SELECT * FROM user")

    fun getall(): List<User>

    @Update

    fun update(user: User)

    @Delete

    fun delete(user: User)


}