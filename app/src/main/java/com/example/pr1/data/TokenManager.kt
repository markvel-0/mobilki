package com.example.pr1.data

import android.content.Context
import android.content.SharedPreferences
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.pr1.data.model.SharedPrefManager
import java.util.prefs.Preferences

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

class TokenManager(private val context: Context){
companion object{
    val ACCESS_TOKEN = stringPreferencesKey("access_token")
}
    suspend fun saveToken(token: String){
        context.dataStore.edit{preferences

        }
    }
}