package com.example.ecommerseproject.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerseproject.data.enitity.Coupons
import com.example.ecommerseproject.databinding.CardDesignBinding
import com.example.ecommerseproject.ui.fragments.HomeFragment

class CouponsAdapter(var mContext: Context, var couponsList: List<Coupons>) :
    RecyclerView.Adapter<CouponsAdapter.CardDesignHolder>() {

    inner class CardDesignHolder ( var binding: CardDesignBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding = CardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val coupon = couponsList.get(position)
        val b = holder.binding
        b.imageView.setImageResource(
            mContext.resources.getIdentifier(coupon.image, "drawable", mContext.packageName)
        )
        b.textView.text = "${coupon.name}"
    }

    override fun getItemCount(): Int {
        return couponsList.size
    }
}