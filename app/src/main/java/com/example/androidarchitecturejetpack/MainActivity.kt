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
    lateinit var textForLiveData : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this,MainViewModelFactory(10)).get(MainViewModel::class.java)
        //provides view model, passing lifecycle
        //TO make an object we used ViewModelProvider and passed lifecycle owner(this) and which class object we need
        //2ed parameter is  fixed value that we want pass to the view model using viewModelFactory

        val buttonClick :Button=findViewById(R.id.buttonForCount)
         textForCount=findViewById(R.id.txtForCount)
        textForLiveData=findViewById(R.id.txtViewForLiveData)
        buttonClick.setOnClickListener {
            mainViewModel.Increment()

            mainViewModel.updateLiveData() // to call the method

           setText()

        }
   setText()


        lifecycle.addObserver(Obeserver())
        Log.d("Main","ACTIVITY OnCreate")



        mainViewModel.factsLiveData.observe(this, Observer {
            // it is string because factsLivedata is string

            //whenever the livedata will change the this code will get executed..

            textForLiveData.text = it //update the value with string of mutable live data


        })
    //1st parameter is lifecycle owner on the basis of
    //that it will decide data send or not. it only sends data
    // it its in active state.


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