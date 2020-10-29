package com.e.myfragment_int

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//
// lesson 6
//fragment
// mvvm - model view viewModel architecture
// view model
// live data

// task
// create 3rd fragment
// move from 2nd to 3rd fragment with a click event

// task
// create another liveData field in viewModel
// update liveData with new text
// observe lioveData in fragment
// update TextView in fragment with new data

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Fragment1.newInstance()
    }
}