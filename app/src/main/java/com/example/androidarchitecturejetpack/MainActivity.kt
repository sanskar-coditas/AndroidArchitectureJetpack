package com.example.androidarchitecturejetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
   lateinit var mainViewModel: MainViewModel
   lateinit var textForCount : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)//provides view model, passing lifecycle



        val buttonClick :Button=findViewById(R.id.buttonForCount)
         textForCount=findViewById(R.id.txtForCount)

        buttonClick.setOnClickListener {
            mainViewModel.Increment()
           setText()

        }
   setText()







        lifecycle.addObserver(Obeserver())
        Log.d("Main","ACTIVITY OnCreate")
    }


    fun setText() {
        textForCount.text=mainViewModel.count.toString()//to set the count to textView
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