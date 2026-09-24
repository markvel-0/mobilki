package com.example.pr1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.pr1.data.model.product.Product
import com.example.pr1.ui.theme.viewmodel.AddProduct


//Разработать мобильное приложение для добавления нового товара:
//Название – Беспроводные наушники SoundWave Pro
//Описание – Наушники с активным шумоподавлением, влагозащитой IPX4 и автономностью до 30 часов работы вместе с кейсом
//Категория – Аудиотехника
//Тэги – Наушники, bluetooth, шумоподавление, беспроводные наушники, гаджеты
//Для добавления нового продукта (product) использовать Fake API https://dummyjson.com/. Вывести данные о добавленном продукте.



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            val getUsers: GetUsers = GetUsers()
//            getUsers.fetch()

            val addProduct: AddProduct= AddProduct()
            val tags= listOf("Наушники", "bluetooth", "шумоподавление", "беспроводные наушники", "гаджеты")
            val product= Product(title="Беспроводные наушники SoundWave Pro",
                description = "Наушники с активным шумоподавлением, влагозащитой IPX4 и автономностью до 30 часов работы вместе с кейсом",
                category = "Аудиотехника",
                tags = tags)
            addProduct.fetch()
            addProduct.addProduct(product)
        }
    }
}

