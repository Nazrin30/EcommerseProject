package com.example.ecommerseproject.data.enitity

import android.graphics.Color

data class Products (var id :Int,
                     var name : String,
                     var image : String,
                     var oldPrice :String,
                     var newPrice :String,
                     var rating : Double,
                     var color: String,
                     var opportunities : String) {
}