package com.example.signupretrofit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signupretrofit.api.ApiConfig
import com.example.signupretrofit.databinding.ActivityRegisterBinding
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener{
            signUp()
        }
    }

    private fun signUp() {
        ApiConfig.instanceRetrofit.register(binding.edtNama.text.toString(),
            binding.edtEmail.text.toString(),
            binding.edtPassword.text.toString(),
            binding.edtPhone.text.toString())
            .enqueue(object : Callback<ResponseBody>{
                override fun onResponse(
                    call: Call<ResponseBody>,
                    response: Response<ResponseBody>
                ) {
                    TODO("Not yet implemented")
                }

                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })
    }
}