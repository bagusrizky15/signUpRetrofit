package com.example.signupretrofit.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.signupretrofit.R
import com.example.signupretrofit.helper.SharedPref

class ProfileFragment : Fragment() {

    lateinit var sp:SharedPref
    lateinit var btnLogout:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_profile, container, false)

        sp = SharedPref(requireActivity())
        btnLogout = view.findViewById(R.id.btn_logout)

        btnLogout.setOnClickListener{
            sp.setStatusLogin(false)
        }

        return view
    }

}