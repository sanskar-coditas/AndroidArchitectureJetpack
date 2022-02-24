package com.example.androidarchitecturejetpack

import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    var count : Int =0

   fun Increment()//method which we are calling in MAinActivity
   {
       count++
   }
}