package com.example.pr1.data.model

import android.content.Context

class SharedPrefManager(private val context: Context) {
    companion object {
        private val SHARED_PREFS="preferences"
        private val SHARED_TOKEN = "access_token"
    }
    private val sharedPrefManager = context.getSharedPreferences(p0 = SHARED_PREFS, p1 = Context.MODE_PRIVATE)
    fun saveTokenToSharedPrefs(token: String){
        sharedPreferences.edit().putString(p0=SHARED_TOKEN,p1=token)
    }

    fun readTokenFromSharedPrefs(): String?{
        return sharedPreferences.getString(p0=SHARED_TOKEN,p1=null)
    }
}

