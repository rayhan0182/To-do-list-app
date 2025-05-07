package com.example.myapplication.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.myapplication.Roomdata.Database
import com.example.myapplication.Roomdata.User
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.rcdata.adapter

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val sub = intent.getStringExtra("title")

        val des = intent.getStringExtra("des")

        val date = intent.getStringExtra("date")

        val duser: MutableList<User> = mutableListOf(User(0,sub.toString(),des.toString(),date.toString()))

        binding.rc.adapter = adapter(duser)


        binding.btn.setOnClickListener {

            startActivity(Intent(this, MainActivity2::class.java))


        }


    }
}