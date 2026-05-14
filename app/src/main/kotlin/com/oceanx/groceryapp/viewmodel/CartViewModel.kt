package com.oceanx.groceryapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.oceanx.groceryapp.data.local.AppDatabase
import com.oceanx.groceryapp.data.model.CartItem
import com.oceanx.groceryapp.data.model.Product
import com.oceanx.groceryapp.data.repository.CartRepository
import kotlinx.coroutines.launch

class CartViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: CartRepository = CartRepository(AppDatabase.getDatabase(application).cartDao())
    val cartItems = repository.allCartItems
    val cartCount = repository.cartCount
    val cartTotal = repository.cartTotal

    fun addToCart(product: Product) = viewModelScope.launch {
        repository.addToCart(
            CartItem(
                productId = product.id,
                name = product.name,
                price = product.price,
                imageUrl = product.imageUrl,
                unit = product.unit
            )
        )
    }

    fun increaseQty(cartItem: CartItem) = viewModelScope.launch {
        repository.increaseQty(cartItem)
    }

    fun decreaseQty(cartItem: CartItem) = viewModelScope.launch {
        repository.decreaseQty(cartItem)
    }

    fun removeItem(cartItem: CartItem) = viewModelScope.launch {
        repository.removeItem(cartItem)
    }

    fun clearCart() = viewModelScope.launch {
        repository.clearCart()
    }
}
