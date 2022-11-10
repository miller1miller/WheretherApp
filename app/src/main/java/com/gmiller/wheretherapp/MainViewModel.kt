package com.gmiller.wheretherapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gmiller.wheretherapp.adapters.WeatherModel

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()

}