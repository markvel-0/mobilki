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
//val putRecipe: PutRecipe= PutRecipe()
//putRecipe.fetch()
//endregion

//Разработать мобильное приложение для получения списка товаров (products):
//Документация к API находится по адресу: http://10.207.106.59:8080/. Вывести полученный список товаров.

//{
//    "record": {
//    "collectionId": "_pb_users_auth_",
//    "collectionName": "users",
//    "created": "2026-10-13 05:42:52.610Z",
//    "email": "katya-solo@list.ru",
//    "emailVisibility": false,
//    "firstName": "kate",
//    "id": "srou2catjs607ux",
//    "lastName": "solo",
//    "role": "",
//    "updated": "2026-10-13 05:42:52.610Z",
//    "verified": false
//},
//    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjb2xsZWN0aW9uSWQiOiJfcGJfdXNlcnNfYXV0aF8iLCJleHAiOjE3OTI0NzUwNTMsImlkIjoic3JvdTJjYXRqczYwN3V4IiwicmVmcmVzaGFibGUiOnRydWUsInR5cGUiOiJhdXRoIn0.v2Nx0f1L0Xr7NDltIvwOHoARQF_M46GA80qRQNQrOaQ"
//}

//request
//record
//login
//product
//
//tokenmanager
//datastore




//curl -X 'GET' \
//'http://10.207.106.59:8090/api/collections/products/records' \
//-H 'accept: application/json' \
//-H 'Authorization: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjb2xsZWN0aW9uSWQiOiJfcGJfdXNlcnNfYXV0aF8iLCJleHAiOjE3OTI0NzUwNTMsImlkIjoic3JvdTJjYXRqczYwN3V4IiwicmVmcmVzaGFibGUiOnRydWUsInR5cGUiOiJhdXRoIn0.v2Nx0f1L0Xr7NDltIvwOHoARQF_M46GA80qRQNQrOaQ'