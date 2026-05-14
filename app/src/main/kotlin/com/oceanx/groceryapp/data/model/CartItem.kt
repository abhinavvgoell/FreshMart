package com.oceanx.groceryapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cart_items")
data class CartItem(
    @PrimaryKey
    val productId: Int,
    val name: String,
    val price: Double,
    val imageUrl: String,
    val unit: String,
    var quantity: Int = 1
) {
    val totalPrice: Double get() = price * quantity
}
