package com.example.appsena

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.appsena.databinding.ActivityMainBinding
import com.example.appsena.databinding.Item2Binding
import com.squareup.picasso.Picasso

class DogViewHolder(view:View) :RecyclerView.ViewHolder(view){
    private val binding=Item2Binding.bind(view)
    fun bind(image:String){
Picasso.get().load(image).into(binding.ivDog)



    }
}