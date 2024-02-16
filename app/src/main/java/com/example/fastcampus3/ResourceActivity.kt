package com.example.fastcampus3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat

class ResourceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)
        findViewById<TextView>(R.id.text).setOnClickListener {
            (it as TextView).text=resources.getText(R.string.app_name)
/*            it.background=resources.getDrawable(R.drawable.arrows)
            it.background=resources.getDrawable(R.drawable.arrows,null)*/
//            it.background=ContextCompat.getDrawable(this, R.drawable.arrows)
            it.background= ResourcesCompat.getDrawable(resources,R.drawable.arrows,null)
        }
    }
}