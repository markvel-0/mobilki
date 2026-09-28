package com.example.pr1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.pr1.data.model.product.Product
import com.example.pr1.data.model.recipe.Recipe
import com.example.pr1.ui.theme.viewmodel.AddProduct
import com.example.pr1.ui.theme.viewmodel.GetUsers
import com.example.pr1.ui.theme.viewmodel.PutRecipe


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //PR16
            val putRecipe: PutRecipe= PutRecipe()
            putRecipe.fetch()

            //PR17
            val getUsers: GetUsers = GetUsers()
            getUsers.deleteUser(26)
        }
    }
}

//region PR14
//            val getUsers: GetUsers = GetUsers()
//            getUsers.fetch()
//endregion

////region PR15
//val addProduct: AddProduct= AddProduct()
//val tags= listOf("Наушники", "bluetooth", "шумоподавление", "беспроводные наушники", "гаджеты")
//val product= Product(title="Беспроводные наушники SoundWave Pro",
//    description = "Наушники с активным шумоподавлением, влагозащитой IPX4 и автономностью до 30 часов работы вместе с кейсом",
//    category = "Аудиотехника",
//    tags = tags)
//addProduct.fetch()
//addProduct.addProduct(product)
//endregion

//region PR16


//endregion