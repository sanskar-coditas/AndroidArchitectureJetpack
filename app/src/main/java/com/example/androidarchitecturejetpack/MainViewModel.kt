package com.example.androidarchitecturejetpack

import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    var count : Int =0
    
   fun Increment()
   {
       count++
   }
}