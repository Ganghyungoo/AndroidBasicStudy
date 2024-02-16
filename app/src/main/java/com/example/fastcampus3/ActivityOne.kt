package com.example.fastcampus3

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
        findViewById<TextView>(R.id.one).setOnClickListener {
            startActivity(Intent(this@ActivityOne,ActivityOne::class.java))
        }
        findViewById<TextView>(R.id.two).setOnClickListener {
            startActivity(Intent(this@ActivityOne,ActivityTwo::class.java))
        }
        findViewById<TextView>(R.id.three).setOnClickListener {
            startActivity(Intent(this@ActivityOne,ActivityThree::class.java))
        }
    }
}