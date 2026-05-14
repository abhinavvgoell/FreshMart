package com.oceanx.groceryapp.data.model

data class Product(
    val id: Int,
    val name: String,
    val category: String,
    val price: Double,
    val imageUrl: String,
    val unit: String = "1 kg"
)
