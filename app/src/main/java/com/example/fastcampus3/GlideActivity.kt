package com.example.fastcampus3

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class GlideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide)

        val imageView = findViewById<ImageView>(R.id.image)
        Glide.with(this)
            .load("https://cdnweb01.wikitree.co.kr/webdata/editor/202007/13/img_20200713162609_859bd4b8.webp")
            .centerCrop()
            .into(imageView)
    }
}