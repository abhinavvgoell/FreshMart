package com.oceanx.groceryapp.ui.checkout

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.oceanx.groceryapp.databinding.ActivityCheckoutBinding
import com.oceanx.groceryapp.ui.order.OrderSuccessActivity
import com.oceanx.groceryapp.viewmodel.CartViewModel

class CheckoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCheckoutBinding
    private val cartViewModel: CartViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Checkout"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        cartViewModel.cartTotal.observe(this) { total ->
            val safeTotal = total ?: 0.0
            binding.tvOrderTotal.text = "₹${(safeTotal + 30).toInt()}"
        }

        binding.btnPlaceOrder.setOnClickListener {
            val address = binding.etAddress.text.toString().trim()
            if (address.isEmpty()) {
                binding.etAddress.error = "Please enter delivery address"
                return@setOnClickListener
            }
            val paymentMethod = if (binding.rbCod.isChecked) "Cash on Delivery" else "Online Payment"
            cartViewModel.clearCart()
            val orderId = "ORD${System.currentTimeMillis().toString().takeLast(6)}"
            val intent = Intent(this, OrderSuccessActivity::class.java).apply {
                putExtra("ORDER_ID", orderId)
                putExtra("ADDRESS", address)
                putExtra("PAYMENT", paymentMethod)
            }
            startActivity(intent)
            finish()
        }
    }

    override fun onSupportNavigateUp(): Boolean { onBackPressed(); return true }
}
