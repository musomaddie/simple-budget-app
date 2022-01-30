package com.example.simplebudget.ui.buckets

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BucketsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is where the buckets should go"
    }
    val text: LiveData<String> = _text
}