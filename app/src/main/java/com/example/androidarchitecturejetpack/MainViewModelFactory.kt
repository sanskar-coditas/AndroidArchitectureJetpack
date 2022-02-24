package com.example.androidarchitecturejetpack

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
//ViewFactory used to pass the parameter to the view model
class MainViewModelFactory(val counter: Int) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {   //Default method
        return MainViewModel(counter) as T //passing parameter

    }

}