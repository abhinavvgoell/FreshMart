package com.oceanx.groceryapp.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nH\'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nH\'J\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\nH\'J\u0019\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/oceanx/groceryapp/data/local/CartDao;", "", "clearCart", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "cartItem", "Lcom/oceanx/groceryapp/data/model/CartItem;", "(Lcom/oceanx/groceryapp/data/model/CartItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCartItems", "Landroidx/lifecycle/LiveData;", "", "getCartCount", "", "getCartItem", "productId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCartTotal", "", "insertOrUpdate", "app_debug"})
@androidx.room.Dao
public abstract interface CartDao {
    
    @androidx.room.Query(value = "SELECT * FROM cart_items")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.oceanx.groceryapp.data.model.CartItem>> getAllCartItems();
    
    @androidx.room.Query(value = "SELECT * FROM cart_items WHERE productId = :productId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCartItem(int productId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.oceanx.groceryapp.data.model.CartItem> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertOrUpdate(@org.jetbrains.annotations.NotNull
    com.oceanx.groceryapp.data.model.CartItem cartItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    com.oceanx.groceryapp.data.model.CartItem cartItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM cart_items")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearCart(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM cart_items")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getCartCount();
    
    @androidx.room.Query(value = "SELECT SUM(price * quantity) FROM cart_items")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.Double> getCartTotal();
}