package com.example.pr1.dummyjson


import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class GetUsers: ViewModel() {

    fun fetchusers(){
        viewModelScope.launch {
            try {
                val usersResponse= RetrofitClient.apiService.getUsers()
                val users=usersResponse.users
                for (user in users) {
                    Log.d("users", "${user}")
                }
            }
            catch (e: Exception){
                Log.e("usererror", "${e.message}")

        }
    }

}

}