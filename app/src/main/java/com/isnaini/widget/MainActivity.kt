package com.isnaini.widget

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.isnaini.widget.databinding.ActivityMainBinding

// Membuat Variable binding
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Inisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        //Memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        //Explisit intent memanggil Activity di project yang sama
        binding.btnWidget.setOnClickListener {
            val intent = Intent(this, Widget::class.java)
            startActivity(intent)
        }

        binding.btnIntentExplicit.setOnClickListener {
            val intent = Intent(this, ImplicitIntent::class.java)
            startActivity(intent)
        }
    }
}