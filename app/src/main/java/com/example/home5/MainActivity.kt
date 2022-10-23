package com.example.home5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.home5.databinding.FragmentBlankBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lateinit var binding: FragmentBlankBinding
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.mmm,BlankFragment()).commit()
    }
}