package com.oceanx.groceryapp.ui.cart

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.oceanx.groceryapp.databinding.ActivityCartBinding
import com.oceanx.groceryapp.ui.checkout.CheckoutActivity
import com.oceanx.groceryapp.viewmodel.CartViewModel

class CartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCartBinding
    private val cartViewModel: CartViewModel by viewModels()
    private lateinit var cartAdapter: CartAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "My Cart"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        cartAdapter = CartAdapter(
            onIncrease = { cartViewModel.increaseQty(it) },
            onDecrease = { cartViewModel.decreaseQty(it) },
            onRemove   = { cartViewModel.removeItem(it) }
        )

        binding.rvCart.apply {
            layoutManager = LinearLayoutManager(this@CartActivity)
            adapter = cartAdapter
        }

        cartViewModel.cartItems.observe(this) { items ->
            cartAdapter.submitList(items)
            binding.emptyLayout.visibility = if (items.isEmpty()) View.VISIBLE else View.GONE
            binding.checkoutLayout.visibility = if (items.isEmpty()) View.GONE else View.VISIBLE
        }

        cartViewModel.cartTotal.observe(this) { total ->
            val safeTotal = total ?: 0.0
            val delivery = if (safeTotal > 0) 30.0 else 0.0
            binding.tvSubtotal.text    = "₹${safeTotal.toInt()}"
            binding.tvDelivery.text    = "₹${delivery.toInt()}"
            binding.tvTotal.text       = "₹${(safeTotal + delivery).toInt()}"
        }

        binding.btnCheckout.setOnClickListener {
            startActivity(Intent(this, CheckoutActivity::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean { onBackPressed(); return true }
}
