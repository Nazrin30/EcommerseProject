package com.example.ecommerseproject.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerseproject.data.enitity.Categories
import com.example.ecommerseproject.databinding.CategoriesCardDesignBinding

class CategoriesAdapter (var mContext: Context, var categoryList: List<Categories>) :
    RecyclerView.Adapter<CategoriesAdapter.CategoriesCardDesignHolder>() {

    inner class CategoriesCardDesignHolder (var binding: CategoriesCardDesignBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesCardDesignHolder {
        val binding = CategoriesCardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CategoriesCardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoriesCardDesignHolder, position: Int) {
        var category = categoryList.get(position)
        var b = holder.binding
        b.imageView.setImageResource(
            mContext.resources.getIdentifier(category.image, "drawable", mContext.packageName)
        )
        b.textView.text = "${category.name}"

    }

    override fun getItemCount(): Int {
        return categoryList.size
    }
}