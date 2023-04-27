package com.zmei.crystalball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zmei.crystalball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.randomText.setOnClickListener {
            binding.randomText.text = getReto()
        }
    }
private fun getReto(): String{
    return resources.getStringArray(R.array.retos)[randomNumber()]
}
private fun randomNumber(): Int{
    val size = resources.getStringArray(R.array.retos).size-1
    return (0..size).random()
}
}