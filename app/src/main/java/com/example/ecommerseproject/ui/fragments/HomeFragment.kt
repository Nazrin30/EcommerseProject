package com.example.ecommerseproject.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.MenuProvider
import androidx.lifecycle.Lifecycle
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.ecommerseproject.R
import com.example.ecommerseproject.data.enitity.Categories
import com.example.ecommerseproject.data.enitity.Coupons
import com.example.ecommerseproject.data.enitity.Products
import com.example.ecommerseproject.databinding.FragmentHomeBinding
import com.example.ecommerseproject.ui.adapter.CategoriesAdapter
import com.example.ecommerseproject.ui.adapter.CouponsAdapter
import com.example.ecommerseproject.ui.adapter.ProductsAdapter


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.toolbar.title=""
//

        val couponsList = ArrayList<Coupons>()
        val coupon1 = Coupons(1, "super_tik_hizi", "Süper tik hızı")
        val coupon2 = Coupons(2, "kategori_kuponu", "Kategori Kuponu")
        val coupon3 = Coupons(3, "kuponlar", "Kuponlar")
        val coupon4 = Coupons(4, "kampaniyalar", "Kampanyalar")
        couponsList.add(coupon1)
        couponsList.add(coupon2)
        couponsList.add(coupon3)
        couponsList.add(coupon4)

        val categoriesList = ArrayList<Categories>()
        val category1 = Categories(1,"Moda", "moda")
        val category2 = Categories(2,"Elektronik", "elektronik")
        val category3 = Categories(3,"Ev & Yaşam", "ev_yasham")
        val category4 = Categories(4,"Anne & Bebek", "anne_ve_bebek")
        val category5 = Categories(5,"Kozmetik", "kozmetik")
        val category6 = Categories(6,"Mücevher", "mucevherler")
        val category7 = Categories(7,"Spor", "spor")
        val category8 = Categories(8,"Tümü", "others_icon2")

        categoriesList.add(category1)
        categoriesList.add(category2)
        categoriesList.add(category3)
        categoriesList.add(category4)
        categoriesList.add(category5)
        categoriesList.add(category6)
        categoriesList.add(category7)
        categoriesList.add(category8)

        val productsList = ArrayList<Products>()
        val product1 = Products(1, "Scooter Siyah Erkek Ayakkabı", "siyah_erkek_ayakkabi","569,99 TL","469,99 TL", 3.5, "#4e5c78", "Mobile özel firsatlar" )
        val product2 = Products(2, "Tefal Ingenio 6 Parçalı Tencere Seti", "tefal_tencere_seti","2.199,99 TL","2.099,99 TL", 4.0, "#ea222f", "Süper Firsatlar")
        val product3 = Products(3, "DS Damat Fit Bordo Pamuklu Kazak", "bordo_kazak","239,00 TL","219.90 TL", 5.0, "#ea222f", "Süper Firsatlar")
        val product4 = Products(4, "Luxell LXAF-01 Fast Fryer", "luxell","3.535,94 TL","3.491,94 TL", 5.0, "#ea222f", "Süper Firsatlar")
        val product5 = Products(5, "Carolina Herra Good Girl Kadın Parfümü", "good_girl","1.099,00 TL","944,10 TL", 4.5, "#ea222f", "Süper Firsatlar")
        val product6 = Products(6, "İspanyol Paça Suni Deri Kadın Pantalon", "pantalon","432.86 TL","338.90 TL", 0.0, "#ea222f", "Süper Firsatlar")

        productsList.add(product1)
        productsList.add(product2)
        productsList.add(product3)
        productsList.add(product4)
        productsList.add(product5)
        productsList.add(product6)



        val adapter = CouponsAdapter(requireContext(), couponsList)
        val adapter2 = CategoriesAdapter(requireContext(), categoriesList)
        val adapter3 = ProductsAdapter(requireContext(), productsList)
        binding.recyclerView.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerView.adapter = adapter

        binding.rv.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)
        binding.rv.adapter = adapter2

        binding.productsRV.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        binding.productsRV.adapter = adapter3
//         binding.view3.setOnClickListener {
//             Navigation.findNavController(it).navigate(R.id.toCategory)
//         }


        binding.actionSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String?): Boolean {
              Log.e("new text", "$newText")
                return false

            }

            override fun onQueryTextSubmit(query: String?): Boolean {
                binding.actionSearch.clearFocus()

                return false
            }
        })

        return binding.root
    }


}