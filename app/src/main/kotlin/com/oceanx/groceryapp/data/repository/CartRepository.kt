package com.oceanx.groceryapp.data.repository

import androidx.lifecycle.LiveData
import com.oceanx.groceryapp.data.local.CartDao
import com.oceanx.groceryapp.data.model.CartItem

class CartRepository(private val cartDao: CartDao) {

    val allCartItems: LiveData<List<CartItem>> = cartDao.getAllCartItems()
    val cartCount: LiveData<Int> = cartDao.getCartCount()
    val cartTotal: LiveData<Double> = cartDao.getCartTotal()

    suspend fun addToCart(cartItem: CartItem) {
        val existing = cartDao.getCartItem(cartItem.productId)
        if (existing != null) {
            cartDao.insertOrUpdate(existing.copy(quantity = existing.quantity + 1))
        } else {
            cartDao.insertOrUpdate(cartItem)
        }
    }

    suspend fun increaseQty(cartItem: CartItem) {
        cartDao.insertOrUpdate(cartItem.copy(quantity = cartItem.quantity + 1))
    }

    suspend fun decreaseQty(cartItem: CartItem) {
        if (cartItem.quantity > 1) {
            cartDao.insertOrUpdate(cartItem.copy(quantity = cartItem.quantity - 1))
        } else {
            cartDao.delete(cartItem)
        }
    }

    suspend fun removeItem(cartItem: CartItem) {
        cartDao.delete(cartItem)
    }

    suspend fun clearCart() {
        cartDao.clearCart()
    }
}
