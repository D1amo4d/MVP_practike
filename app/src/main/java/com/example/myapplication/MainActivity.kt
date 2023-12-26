package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicers()
        presenter.attachView(this)

    }

    private fun initClicers() {
        with(binding) {
            binding.btnPlus.setOnClickListener {
                presenter.incriment()
            }

            btnMinus.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun showCount(count: Int) {
        binding.tvAge.text = count.toString()
    }

    override fun changeTextColorToGreen() {
        binding.tvAge.setTextColor(Color.GREEN)
    }

    override fun resetTextColor() {
        binding.tvAge.setTextColor(Color.BLACK)
    }

    override fun showNotification() {
        Toast.makeText(this, "Достигнуто значение 10!", Toast.LENGTH_LONG).show()
    }
}