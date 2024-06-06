package com.wjdaudtn.ExportActivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.wjdaudtn.ExportActivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnGotoTwo.setOnClickListener{
            val intent = Intent(this, TwoActivity::class.java)
            startActivity(intent)
        }

    }
}