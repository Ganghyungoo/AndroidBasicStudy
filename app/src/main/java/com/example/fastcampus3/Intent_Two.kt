package com.example.fastcampus3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Intent_Two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_two)
        //Intent_Two엑티비티를 호출한 Activity의 intent이다.
        val intent = intent
        val data: String?= intent.extras?.getString("extra-data")
        if(data!=null){
            Log.d("dataa",data)
        }
        findViewById<TextView>(R.id.finish).apply{
            this.setOnClickListener {
                val intent =Intent(this@Intent_Two,Intent_One::class.java)
                intent.putExtra("result","success")
                setResult(RESULT_OK,intent)
                finish()
            }
        }
        val imageView:ImageView=findViewById(R.id.imageView)
        val uri=Uri.parse(
            intent.getParcelableExtra<Parcelable>(Intent.EXTRA_STREAM).toString()
        )
        imageView.setImageURI(uri)

    }
}