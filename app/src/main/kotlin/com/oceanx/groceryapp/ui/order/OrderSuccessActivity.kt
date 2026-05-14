package com.oceanx.groceryapp.ui.order

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.oceanx.groceryapp.databinding.ActivityOrderSuccessBinding
import com.oceanx.groceryapp.ui.home.HomeActivity

class OrderSuccessActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOrderSuccessBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderSuccessBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val orderId = intent.getStringExtra("ORDER_ID") ?: "ORD000000"
        val address = intent.getStringExtra("ADDRESS") ?: ""
        val payment = intent.getStringExtra("PAYMENT") ?: ""

        binding.tvOrderId.text       = "Order ID: $orderId"
        binding.tvDeliveryTime.text  = "Estimated Delivery: 30–45 minutes"
        binding.tvAddress.text       = "Delivering to: $address"
        binding.tvPaymentMode.text   = "Payment: $payment"

        binding.btnContinueShopping.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
            finish()
        }
    }
}
