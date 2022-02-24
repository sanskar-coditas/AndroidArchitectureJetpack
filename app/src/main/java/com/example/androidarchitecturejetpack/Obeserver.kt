package com.example.androidarchitecturejetpack

import android.util.Log
import androidx.lifecycle.*

class Obeserver: DefaultLifecycleObserver {
//this is an observer to minimize the code in main activity.
 override fun onCreate(owner: LifecycleOwner) {
  super.onCreate(owner)
  Log.d("Main","OBSERVER ON CREATE")
 }

 override fun onResume(owner: LifecycleOwner) {
  super.onResume(owner)
  Log.d("Main","OBSERVER ON onResume")
 }

 override fun onPause(owner: LifecycleOwner) {
  super.onPause(owner)
  Log.d("Main","OBSERVER ON onPause")
 }

 override fun onStop(owner: LifecycleOwner) {
  super.onStop(owner)
  Log.d("Main","OBSERVER ON onStop")
 }

 override fun onDestroy(owner: LifecycleOwner) {
  super.onDestroy(owner)
  Log.d("Main","OBSERVER ON onDestroy")
 }







}