package com.oceanx.groceryapp.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.oceanx.groceryapp.data.model.CartItem

@Dao
interface CartDao {

    @Query("SELECT * FROM cart_items")
    fun getAllCartItems(): LiveData<List<CartItem>>

    @Query("SELECT * FROM cart_items WHERE productId = :productId")
    suspend fun getCartItem(productId: Int): CartItem?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(cartItem: CartItem)

    @Delete
    suspend fun delete(cartItem: CartItem)

    @Query("DELETE FROM cart_items")
    suspend fun clearCart()

    @Query("SELECT COUNT(*) FROM cart_items")
    fun getCartCount(): LiveData<Int>

    @Query("SELECT SUM(price * quantity) FROM cart_items")
    fun getCartTotal(): LiveData<Double>
}
