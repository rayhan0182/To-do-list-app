package com.example.myapplication.rcdata

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Roomdata.User
import com.example.myapplication.databinding.NotelistBinding

class adapter(private val nitems: List<User>): RecyclerView.Adapter<viewholder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): viewholder {

        val view = NotelistBinding.inflate(LayoutInflater.from(parent.context),parent,false)

       return viewholder(view)
    }

    override fun onBindViewHolder(
        holder: viewholder,
        position: Int
    ) {


        holder.binding.apply {

            date.text = nitems[position].date

            title.text = nitems[position].title

            des.text = nitems[position].description


        }

    }

    override fun getItemCount(): Int {

       return nitems.size


    }
}