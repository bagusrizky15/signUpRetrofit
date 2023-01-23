package com.example.signupretrofit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signupretrofit.R
import com.example.signupretrofit.databinding.ActivityLoginBinding
import com.example.signupretrofit.helper.SharedPref

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    lateinit var sp: SharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sp = SharedPref(this)

        binding.btnToLogin.setOnClickListener{
            sp.setStatusLogin(true)
        }

    }
}