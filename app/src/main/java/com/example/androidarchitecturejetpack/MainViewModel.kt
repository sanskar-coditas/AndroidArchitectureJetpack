package com.example.androidarchitecturejetpack

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(InitialValue:Int):ViewModel() {     //InitialValue is the value that we passed in
                                                        //viewmodelFactoryclass to set initalvalue of counter to 10
    var count : Int =InitialValue

   fun Increment()//method which we are calling in MAinActivity
   {
       count++
   }


   private val factsLiveDataObject = MutableLiveData("This id a fact") // this is update live data (we can change
                                                                                // the data)
    val factsLiveData : LiveData<String> // just normal Livedata implementation
    get() = factsLiveDataObject // getting factsLiveDataObject here ( does not change output)

    fun updateLiveData(){
    factsLiveDataObject.value = "Another fact" // this will update the live data

    }


}