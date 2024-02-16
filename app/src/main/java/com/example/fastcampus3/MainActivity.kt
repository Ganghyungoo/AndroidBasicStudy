package com.example.fastcampus3

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_layout_1)
        Log.d("Lifecycle","onCleate")
    }

    override fun onStart() {
        Log.d("Lifecycle","onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("Lifecycle","onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("Lifecycle","onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("Lifecycle","onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("Lifecycle","onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d("Lifecycle","onRestart")
        super.onRestart()
    }
}