package com.example.androidarchitecturejetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Obeserver())
        Log.d("Main","ACTIVITY OnCreate")

    }

    override fun onResume() {
        super.onResume()

        Log.d("Main","ACTIVITY onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Main","ACTIVITY onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main","ACTIVITY onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main","ACTIVITY onDestroy")
    }
}