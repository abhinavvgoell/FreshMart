package com.oceanx.groceryapp.ui.home

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.oceanx.groceryapp.databinding.ActivityHomeBinding
import com.oceanx.groceryapp.ui.cart.CartActivity
import com.oceanx.groceryapp.utils.FakeData
import com.oceanx.groceryapp.viewmodel.CartViewModel

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private val cartViewModel: CartViewModel by viewModels()
    private lateinit var productAdapter: ProductAdapter
    private lateinit var categoryAdapter: CategoryAdapter
    private var selectedCategory = "All"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupCategoryRecycler()
        setupProductRecycler()
        observeCart()
        setupSearch()

        binding.fabCart.setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }
    }

    private fun setupCategoryRecycler() {
        categoryAdapter = CategoryAdapter(FakeData.categories) { category ->
            selectedCategory = category
            filterProducts()
        }
        binding.rvCategories.apply {
            layoutManager = LinearLayoutManager(this@HomeActivity, LinearLayoutManager.HORIZONTAL, false)
            adapter = categoryAdapter
        }
    }

    private fun setupProductRecycler() {
        productAdapter = ProductAdapter(FakeData.products) { product ->
            cartViewModel.addToCart(product)
        }
        binding.rvProducts.apply {
            layoutManager = GridLayoutManager(this@HomeActivity, 2)
            adapter = productAdapter
        }
    }

    private fun observeCart() {
        cartViewModel.cartCount.observe(this) { count ->
            val safeCount = count ?: 0
            binding.tvCartCount.text = safeCount.toString()
            binding.tvCartCount.visibility = if (safeCount > 0)
                android.view.View.VISIBLE else android.view.View.GONE
        }
    }

    private fun setupSearch() {
        binding.etSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                filterProducts(s.toString())
            }
            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun filterProducts(query: String = binding.etSearch.text.toString()) {
        val filtered = FakeData.products.filter { product ->
            val matchesCategory = selectedCategory == "All" || product.category == selectedCategory
            val matchesSearch = query.isEmpty() || product.name.contains(query, ignoreCase = true)
            matchesCategory && matchesSearch
        }
        productAdapter.updateList(filtered)
    }
}
