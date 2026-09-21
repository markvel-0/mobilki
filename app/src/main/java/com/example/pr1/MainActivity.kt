package com.example.pr1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.pr1.ui.theme.viewmodel.GetUsers


//Разработать мобильное приложение для получения и отображения списка пользователей.
// Для получения списка пользователей (users) использовать Fake API https://dummyjson.com/.
// Вывести полученный список пользователей, включая имя (firstName + lastName),
// адрес электронной почты (email) и дату рождения (birthDate) пользователя.


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val getUsers: GetUsers = GetUsers()
            getUsers.fetch()
        }
    }
}

//val layout= LinearLayout(this)
//val textView = TextView(this)
//textView.text="test"
//layout.addView(textView)
//setContentView(layout)
//
//getUsers()

//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