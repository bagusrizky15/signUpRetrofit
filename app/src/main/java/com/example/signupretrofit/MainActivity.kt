package com.example.signupretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.signupretrofit.databinding.ActivityMainBinding
import com.example.signupretrofit.fragment.HomeFragment
import com.example.signupretrofit.fragment.ProfileFragment
import com.example.signupretrofit.fragment.ShopFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    val fragmentHome: Fragment = HomeFragment()
    val fragmentShop: Fragment = ShopFragment()
    val fragmentProfile: Fragment = ProfileFragment()
    val fm: FragmentManager = supportFragmentManager
    var active: Fragment=fragmentHome

    private lateinit var menu: Menu
    private lateinit var menuItem: MenuItem
    private lateinit var bottomNavigationView: BottomNavigationView

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpBottomNav()
    }

    fun setUpBottomNav(){
        fm.beginTransaction().add(R.id.container, fragmentHome).show(fragmentHome).commit()
        fm.beginTransaction().add(R.id.container, fragmentShop).hide(fragmentShop).commit()
        fm.beginTransaction().add(R.id.container, fragmentProfile).hide(fragmentProfile).commit()

        bottomNavigationView = binding.navView
        menu = bottomNavigationView.menu
        menuItem = menu.getItem(0)
        menuItem.isChecked = true

        bottomNavigationView.setOnNavigationItemSelectedListener {
                item ->
            when(item.itemId){
                R.id.navigation_home -> {
                    callFragment(0, fragmentHome)
                }

                R.id.navigation_shop -> {
                    callFragment(1, fragmentShop)
                }

                R.id.navigation_profile -> {
                    callFragment(2, fragmentProfile)
                }
            }
            false
        }
    }

    fun callFragment(int: Int, fragment: Fragment){
        Log.d("Respon", "${fragment}")
        menuItem = menu.getItem(int)
        menuItem.isChecked = true
        fm.beginTransaction().hide(active).show(fragment).commit()
        active = fragment
    }
}