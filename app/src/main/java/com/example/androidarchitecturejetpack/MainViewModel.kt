package com.example.androidarchitecturejetpack

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(InitialValue:Int):ViewModel() {     //InitialValue is the value that we passed in
                                                            //viewmodelFactoryclass to set initalvalue of counter to 10
    var count : Int =InitialValue

   fun Increment()//method which we are calling in MAinActivity
   {
       count++
   }


    val factsLiveData = MutableLiveData<String>("This id a fact") // this is utable live data (we can change
                                                                        // the data)
    fun updateLiveData(){
        factsLiveData.value = "Another fact" // this will update the live data
    }


}