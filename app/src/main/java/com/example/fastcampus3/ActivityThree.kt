package com.example.fastcampus3

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        findViewById<TextView>(R.id.one).setOnClickListener {
            val intent=Intent(this@ActivityThree,ActivityOne::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
        findViewById<TextView>(R.id.two).setOnClickListener {
            startActivity(Intent(this@ActivityThree,ActivityTwo::class.java))
        }
        findViewById<TextView>(R.id.three).setOnClickListener {
            startActivity(Intent(this@ActivityThree,ActivityThree::class.java))
        }
    }
}