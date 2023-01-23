package com.example.signupretrofit.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.viewpager.widget.ViewPager
import com.example.signupretrofit.AdapterSlider
import com.example.signupretrofit.R
import com.example.signupretrofit.adapter.AdapterProduk
import com.example.signupretrofit.model.Produk

class HomeFragment : Fragment() {

    lateinit var vpSlider : ViewPager
    lateinit var rvProdukTerbaru: RecyclerView
    lateinit var rvProdukTerlaris: RecyclerView
    lateinit var rvProdukElektronik: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_home, container, false)

        vpSlider = view.findViewById(R.id.vp_slider)
        rvProdukTerlaris = view.findViewById(R.id.rv_produk_terlaris)
        rvProdukTerbaru = view.findViewById(R.id.rv_produk_terbaru)
        rvProdukElektronik = view.findViewById(R.id.rv_produk_elektronik)

        var arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.slider1)
        arrSlider.add(R.drawable.slider2)
        arrSlider.add(R.drawable.slider3)

        val adapterSlider = AdapterSlider(arrSlider, activity)
        vpSlider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager2 = LinearLayoutManager(activity)
        layoutManager2.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager3 = LinearLayoutManager(activity)
        layoutManager3.orientation = LinearLayoutManager.HORIZONTAL

        rvProdukTerlaris.adapter = AdapterProduk(arrProdukTerlaris)
        rvProdukTerlaris.layoutManager = layoutManager

        rvProdukTerbaru.adapter = AdapterProduk(arrProdukTerbaru)
        rvProdukTerbaru.layoutManager = layoutManager2

        rvProdukElektronik.adapter = AdapterProduk(arrProdukElektronik)
        rvProdukElektronik.layoutManager = layoutManager3

        return view
    }

    val arrProdukTerbaru : ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "Hp Realme C3"
        p1.harga = "Rp.2.000.000"
        p1.gambar = R.drawable.hp_14_bs749tu

        val p2 = Produk()
        p2.nama = "Hp Realme C3"
        p2.harga = "Rp.2.000.000"
        p2.gambar = R.drawable.hp_14_bs749tu

        val p3 = Produk()
        p3.nama = "Hp Realme C3"
        p3.harga = "Rp.2.000.000"
        p3.gambar = R.drawable.hp_14_bs749tu

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }

    val arrProdukTerlaris : ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "Hp Realme C3"
        p1.harga = "Rp.2.000.000"
        p1.gambar = R.drawable.hp_14_bs749tu

        val p2 = Produk()
        p2.nama = "Hp Realme C3"
        p2.harga = "Rp.2.000.000"
        p2.gambar = R.drawable.hp_14_bs749tu

        val p3 = Produk()
        p3.nama = "Hp Realme C3"
        p3.harga = "Rp.2.000.000"
        p3.gambar = R.drawable.hp_14_bs749tu

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }

    val arrProdukElektronik : ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "Hp Realme C3"
        p1.harga = "Rp.2.000.000"
        p1.gambar = R.drawable.hp_14_bs749tu

        val p2 = Produk()
        p2.nama = "Hp Realme C3"
        p2.harga = "Rp.2.000.000"
        p2.gambar = R.drawable.hp_14_bs749tu

        val p3 = Produk()
        p3.nama = "Hp Realme C3"
        p3.harga = "Rp.2.000.000"
        p3.gambar = R.drawable.hp_14_bs749tu

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }
}