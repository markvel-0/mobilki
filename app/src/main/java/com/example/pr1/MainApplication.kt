package com.example.pr1

import android.app.Application
import com.example.pr1.data.model.SharedPrefManager

class MainApplication: Application() {
    lateinit var sharedPrefManager: SharedPrefManager
    override fun onCreate() {
        super.onCreate()
        sharedPrefManager= SharedPrefManager(applicationContext)
    }
}