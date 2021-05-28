package com.example.popularlibraries

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.popularlibraries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = MainPresenter(this, CountersModel())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnCounter1.setOnClickListener { presenter.counterClick(BtnCounterNumber.ONE) }
            btnCounter2.setOnClickListener { presenter.counterClick(BtnCounterNumber.TWO) }
            btnCounter3.setOnClickListener { presenter.counterClick(BtnCounterNumber.THREE) }
        }
    }

    override fun setButton1Text(text: String) {
        binding.btnCounter1.text = text
    }

    override fun setButton2Text(text: String) {
        binding.btnCounter2.text = text
    }

    override fun setButton3Text(text: String) {
        binding.btnCounter3.text = text
    }
}
