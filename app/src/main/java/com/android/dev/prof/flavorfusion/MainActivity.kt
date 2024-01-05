package com.android.dev.prof.flavorfusion

import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.android.dev.prof.flavorfusion.databinding.ActivityMainBinding
import jp.wasabeef.blurry.Blurry

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val bitmapDrawable =binding.splashImage.drawable as BitmapDrawable

        val bitmap = bitmapDrawable.bitmap
        Blurry.with(this).from(bitmap).into(binding.splashImage)

        binding.startCookingBtn.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

    }
}