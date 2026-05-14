package com.oceanx.groceryapp.ui.cart;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0012\u0013BA\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/oceanx/groceryapp/ui/cart/CartAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/oceanx/groceryapp/data/model/CartItem;", "Lcom/oceanx/groceryapp/ui/cart/CartAdapter$CartViewHolder;", "onIncrease", "Lkotlin/Function1;", "", "onDecrease", "onRemove", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CartViewHolder", "Companion", "app_debug"})
public final class CartAdapter extends androidx.recyclerview.widget.ListAdapter<com.oceanx.groceryapp.data.model.CartItem, com.oceanx.groceryapp.ui.cart.CartAdapter.CartViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.oceanx.groceryapp.data.model.CartItem, kotlin.Unit> onIncrease = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.oceanx.groceryapp.data.model.CartItem, kotlin.Unit> onDecrease = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.oceanx.groceryapp.data.model.CartItem, kotlin.Unit> onRemove = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.oceanx.groceryapp.data.model.CartItem> DIFF_CALLBACK = null;
    @org.jetbrains.annotations.NotNull
    public static final com.oceanx.groceryapp.ui.cart.CartAdapter.Companion Companion = null;
    
    public CartAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.oceanx.groceryapp.data.model.CartItem, kotlin.Unit> onIncrease, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.oceanx.groceryapp.data.model.CartItem, kotlin.Unit> onDecrease, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.oceanx.groceryapp.data.model.CartItem, kotlin.Unit> onRemove) {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.oceanx.groceryapp.ui.cart.CartAdapter.CartViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.oceanx.groceryapp.ui.cart.CartAdapter.CartViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/oceanx/groceryapp/ui/cart/CartAdapter$CartViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/oceanx/groceryapp/databinding/ItemCartBinding;", "(Lcom/oceanx/groceryapp/ui/cart/CartAdapter;Lcom/oceanx/groceryapp/databinding/ItemCartBinding;)V", "getBinding", "()Lcom/oceanx/groceryapp/databinding/ItemCartBinding;", "app_debug"})
    public final class CartViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.oceanx.groceryapp.databinding.ItemCartBinding binding = null;
        
        public CartViewHolder(@org.jetbrains.annotations.NotNull
        com.oceanx.groceryapp.databinding.ItemCartBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.oceanx.groceryapp.databinding.ItemCartBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/oceanx/groceryapp/ui/cart/CartAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/oceanx/groceryapp/data/model/CartItem;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.oceanx.groceryapp.data.model.CartItem> getDIFF_CALLBACK() {
            return null;
        }
    }
}