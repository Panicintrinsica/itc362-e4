package com.corbin.msu.tapcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.corbin.msu.tapcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tapper = Tapper()

        binding.tapperButton.setOnClickListener {
            tapper.tap()
            tapper.displayTaps(binding.taps)
        }
    }

    class Tapper {
        private var count: Int = 0

        fun tap() {
            count++
        }

        fun displayTaps(view: TextView) {
            view.text = count.toString()
        }
    }
}