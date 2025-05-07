package com.example.myapplication.Activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.myapplication.Roomdata.Database
import com.example.myapplication.Roomdata.User
import com.example.myapplication.Roomdata.UserDao
import com.example.myapplication.databinding.ActivityMain2Binding
import kotlin.toString

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = Room.databaseBuilder(

            applicationContext,

            Database::class.java, "notelistname"


        ).allowMainThreadQueries().build()

        val bd = db.database()


        homepage()

        userdatacreate(bd)


    }


    private fun userdatacreate(bd: UserDao) {

        binding.save.setOnClickListener {

            val title = binding.title.text.toString()

            val des = binding.ds.text.toString()

            val date = binding.date.text.toString()

            var udata = User(0, title.toString(), des.toString(), date.toString())


            bd.insert(udata)

            bd.getall().forEach {

                val intent = Intent(this, MainActivity::class.java)

                intent.putExtra("title", it.title)

                intent.putExtra("des", it.description)

                intent.putExtra("date", it.date)

                startActivity(intent)


            }


        }


    }


    private fun homepage() {

        binding.homepage.setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))

        }
    }
}