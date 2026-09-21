package com.example.pr1.ui.theme.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr1.data.RetrofitClient
import kotlinx.coroutines.launch

class GetUsers: ViewModel() {
    fun fetch(){
        viewModelScope.launch {
            try {
                val usersResponse= RetrofitClient.apiService.getUsers()
                val users=usersResponse.users
                for (user in users) {
                    Log.d("users", "Имя: ${user.firstName} ${user.lastName}\n Почта: ${user.email}\n Дата рождения:${user.birthDate}")
                }
            }
            catch (e: Exception){
                Log.e("usererror", "${e.message}")

        }
    }

}

}