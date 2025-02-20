package com.boussalh.jobapp.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.boussalh.jobapp.R
import com.boussalh.jobapp.databinding.ActivityIntoBinding

class IntoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        binding.GoBtn.setOnClickListener {
            val intent = Intent(this@IntoActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}