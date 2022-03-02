package com.example.androidarchitecturejetpack

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.example.androidarchitecturejetpack.databinding.ActivityAdapterBinding
import com.example.androidarchitecturejetpack.databinding.ActivityMainBinding

class AdapterActivity: AppCompatActivity() {
    lateinit var binding: ActivityAdapterBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_adapter )

        val dataForPost= Post("introduction to kotlin sanskar", "abcdefghijklmn", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQgQ35I5QA8vp6xn9xkGYeZGRu9LJ3kfp2pchNOVE-iNowV3eFq" )
         binding.post= dataForPost



       // Glide.with(this).load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQgQ35I5QA8vp6xn9xkGYeZGRu9LJ3kfp2pchNOVE-iNowV3eFq").into(binding.imgID)


    }






}