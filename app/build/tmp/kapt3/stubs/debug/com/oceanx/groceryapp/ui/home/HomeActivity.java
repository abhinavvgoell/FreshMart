package com.oceanx.groceryapp.ui.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/oceanx/groceryapp/ui/home/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/oceanx/groceryapp/databinding/ActivityHomeBinding;", "cartViewModel", "Lcom/oceanx/groceryapp/viewmodel/CartViewModel;", "getCartViewModel", "()Lcom/oceanx/groceryapp/viewmodel/CartViewModel;", "cartViewModel$delegate", "Lkotlin/Lazy;", "categoryAdapter", "Lcom/oceanx/groceryapp/ui/home/CategoryAdapter;", "productAdapter", "Lcom/oceanx/groceryapp/ui/home/ProductAdapter;", "selectedCategory", "", "filterProducts", "", "query", "observeCart", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupCategoryRecycler", "setupProductRecycler", "setupSearch", "app_debug"})
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.oceanx.groceryapp.databinding.ActivityHomeBinding binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy cartViewModel$delegate = null;
    private com.oceanx.groceryapp.ui.home.ProductAdapter productAdapter;
    private com.oceanx.groceryapp.ui.home.CategoryAdapter categoryAdapter;
    @org.jetbrains.annotations.NotNull
    private java.lang.String selectedCategory = "All";
    
    public HomeActivity() {
        super();
    }
    
    private final com.oceanx.groceryapp.viewmodel.CartViewModel getCartViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupCategoryRecycler() {
    }
    
    private final void setupProductRecycler() {
    }
    
    private final void observeCart() {
    }
    
    private final void setupSearch() {
    }
    
    private final void filterProducts(java.lang.String query) {
    }
}