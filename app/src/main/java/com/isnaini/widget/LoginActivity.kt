package com.isnaini.widget

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.isnaini.widget.databinding.ActivityLoginBinding

private lateinit var binding: ActivityLoginBinding
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Inisialisasi binding
        binding = ActivityLoginBinding.inflate(layoutInflater)
        //Memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val dataLogin = ModelLogin(binding.txtUser.text.toString(), binding.txtPass.text.toString())
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("data", dataLogin)
            startActivity(intent)
            finish()
        }
    }
}