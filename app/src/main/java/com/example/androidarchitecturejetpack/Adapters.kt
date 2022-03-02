package com.example.androidarchitecturejetpack

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageFromUrl")
fun ImageView.imageFromUrl(url:String){

    Glide.with(this.context).load(url).into(this)
    Log.d("url for image ",url )

}