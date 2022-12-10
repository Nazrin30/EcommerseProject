package com.example.ecommerseproject.ui.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerseproject.data.enitity.Products
import com.example.ecommerseproject.databinding.ProductsCardDesignBinding

class ProductsAdapter (var mContext: Context, var productsList: List<Products> ) :
    RecyclerView.Adapter<ProductsAdapter.ProductsCardDesignHolder>() {

    inner class ProductsCardDesignHolder (var binding: ProductsCardDesignBinding) :RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsCardDesignHolder {
        val binding = ProductsCardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return ProductsCardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductsCardDesignHolder, position: Int) {
       val product = productsList.get(position)
        val b = holder.binding
        b.productImage.setImageResource(
            mContext.resources.getIdentifier(product.image, "drawable", mContext.packageName)
        )
        b.productName.text = product.name
        b.poductRate.rating = product.rating.toFloat()
        b.oldPrice.text = product.oldPrice
        b.newPrice.text = product.newPrice
        b.superFirsatlar.text = product.opportunities
        b.viewCompany.setBackgroundColor(Color.parseColor(product.color))

    }

    override fun getItemCount(): Int {
        return productsList.size
    }
}