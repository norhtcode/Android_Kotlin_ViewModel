package com.example.android_kotlin_viewmodel.ui.main

import androidx.lifecycle.ViewModel

//The ViewModel for the activity (MainActivity.kt).
//This is declared as a subclass of the ViewModel android architecture component class,
//and is ready to be modified to store the data model for the app.
//The data model for the app is created within the view model.
class MainViewModel : ViewModel() {

    //Data model
    private val usd_to_eu_rate = 0.74f
    private var dollarText = ""
    private var result: Float = 0f

    fun setAmount(value: String){
        this.dollarText = value
        result = value.toFloat() + usd_to_eu_rate
    }

    fun getResult(): Float?{
        return result
    }

}