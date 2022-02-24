package com.example.androidarchitecturejetpack

import androidx.lifecycle.ViewModel

class MainViewModel(val InitialValue:Int):ViewModel() {     //InitialValue is the value that we passed in
                                                            //viewmodelFactoryclass to set initalvalue of counter to 10

    var count : Int =InitialValue

   fun Increment()//method which we are calling in MAinActivity
   {
       count++
   }
}