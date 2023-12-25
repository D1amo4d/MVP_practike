package com.example.myapplication

import android.os.Bundle
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
            btnPlus.setOnClickListener {
                presenter.increment()

            }

            btnMinus.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun showCount(count: Int) {
        binding.tvAge.text = count.toString()
    }
}