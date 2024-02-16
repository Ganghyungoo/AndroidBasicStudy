package com.example.fastcampus3

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ApplicationActivityOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_application_one)

        findViewById<TextView>(R.id.changeActivity).setOnClickListener {
            startActivity(Intent(this,ApplicationActivityTwo::class.java))
        }
        findViewById<TextView>(R.id.testMethod).setOnClickListener {
            (applicationContext as MasterApplication).methodFromApplication()
        }

    }
}