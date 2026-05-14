package com.oceanx.groceryapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.oceanx.groceryapp.R
import com.oceanx.groceryapp.data.model.Product
import com.oceanx.groceryapp.databinding.ItemProductBinding

class ProductAdapter(
    private var products: List<Product>,
    private val onAddToCart: (Product) -> Unit
) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]
        with(holder.binding) {
            tvProductName.text = product.name
            tvProductPrice.text = "₹${product.price.toInt()}"
            tvProductUnit.text = product.unit
            Glide.with(root.context)
                .load(product.imageUrl)
                .placeholder(R.drawable.ic_placeholder)
                .into(ivProduct)
            btnAddToCart.setOnClickListener {
                onAddToCart(product)
                // Animate button
                btnAddToCart.text = "Added ✓"
                root.postDelayed({ btnAddToCart.text = "+ Add" }, 1000)
            }
        }
    }

    override fun getItemCount() = products.size

    fun updateList(newList: List<Product>) {
        products = newList
        notifyDataSetChanged()
    }
}
