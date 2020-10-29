package com.e.myfragment_int

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData

class Fragment3ViewModel : ViewModel() {

    // TODO: Implement the ViewModel

    // MutableLiveData is a LiveData that can be changed
    // MutableLiveData inherit from LiveData
    private var data0 = MutableLiveData<String>()
    val _data0 : LiveData<String>
        get() {
            return data0
        }

    private var data1 = MutableLiveData<String>()
    val _data1 : LiveData<String>
        get() {
            return data1
        }



    // 1
    fun addData(str0: String) {
        data0.value = str0
        data1.value = str0 + "aaa"
    }
}