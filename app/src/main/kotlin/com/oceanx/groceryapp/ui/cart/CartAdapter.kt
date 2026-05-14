package com.oceanx.groceryapp.ui.cart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.oceanx.groceryapp.R
import com.oceanx.groceryapp.data.model.CartItem
import com.oceanx.groceryapp.databinding.ItemCartBinding

class CartAdapter(
    private val onIncrease: (CartItem) -> Unit,
    private val onDecrease: (CartItem) -> Unit,
    private val onRemove: (CartItem) -> Unit
) : ListAdapter<CartItem, CartAdapter.CartViewHolder>(DIFF_CALLBACK) {

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<CartItem>() {
            override fun areItemsTheSame(old: CartItem, new: CartItem) = old.productId == new.productId
            override fun areContentsTheSame(old: CartItem, new: CartItem) = old == new
        }
    }

    inner class CartViewHolder(val binding: ItemCartBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = ItemCartBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val item = getItem(position)
        with(holder.binding) {
            tvItemName.text  = item.name
            tvItemPrice.text = "₹${item.price.toInt()} × ${item.quantity}"
            tvItemTotal.text = "₹${item.totalPrice.toInt()}"
            tvQuantity.text  = item.quantity.toString()
            Glide.with(root.context)
                .load(item.imageUrl)
                .placeholder(R.drawable.ic_placeholder)
                .into(ivItem)
            btnIncrease.setOnClickListener { onIncrease(item) }
            btnDecrease.setOnClickListener { onDecrease(item) }
            btnRemove.setOnClickListener   { onRemove(item) }
        }
    }
}
