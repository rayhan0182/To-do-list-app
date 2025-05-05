package com.example.myapplication.Roomdata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(

    @PrimaryKey(autoGenerate = true)

    val id: Int,

    val title: String,

    val description: String,

    val date: String,


    )
