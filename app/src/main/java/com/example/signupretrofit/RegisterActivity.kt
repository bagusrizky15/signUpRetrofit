package com.example.signupretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.signupretrofit.api.ApiInterface
import com.example.signupretrofit.api.RetrofitInstance
import com.example.signupretrofit.databinding.ActivityRegisterBinding
import com.example.signupretrofit.model.UserBody
import okhttp3.Call
import okhttp3.Response
import okhttp3.ResponseBody
import javax.security.auth.callback.Callback

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener{
            signUp()
        }
    }

    private fun signUp(email: String, name: String, password: String) {
        val retIn = RetrofitInstance.getRetrofitInstance().create(ApiInterface::class.java)

        val registerInfo = UserBody(email,name, password)

        retIn.registerUser(registerInfo).enqueue(object :
        okhttp3.Callback<ResponseBody>, retrofit2.Callback<ResponseBody> {
            override fun onFailure(call: Call<ResponseBody>,t: Throwable){
                Toast.makeText(
                    this@RegisterActivity,
                    t.message,
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onResponse(
                call: retrofit2.Call<ResponseBody>,
                response: retrofit2.Response<ResponseBody>
            ) {
                if (response.code() = 201) {
                    Toast.makeText(this@RegisterActivity, "Registration success!", Toast.LENGTH_SHORT)
                        .show()
                }else{
                    Toast.makeText(this@RegisterActivity, "Registration failed!", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        })
    }

}