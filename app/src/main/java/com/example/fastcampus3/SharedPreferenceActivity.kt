package com.example.fastcampus3

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SharedPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        //SharedPreference 사용법
        findViewById<TextView>(R.id.create).setOnClickListener{
            //create 하는법
            val sharedPreferences=getSharedPreferences("table_name", Context.MODE_PRIVATE)
            //MODE
            //MODE_PRIVATE->현재 앱에서만 사용을 하겠다.->다른 앱과 공유하지 않겠다.
            //MODE_WORLD_READABLE: 다른 앱에서도 사용가능(읽기만 가능)
            //MODE_WORLD_WRITABLE: 다른 앱에서도 사용 가능(읽기,쓰기 가능)
            //MODE_MULTI_PROCESS: 이미 호출되어 사용 중인지 체크
            //MODE_APPEND: 기존 preference에 신규로 추가한다.
            val editor:SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("key1","hello")//key-value방식으로 데이터를 저장
            editor.putString("key2","hello2")
            editor.commit()
        }
        findViewById<TextView>(R.id.read).setOnClickListener {
            val sharedPreferences=getSharedPreferences("table_name", Context.MODE_PRIVATE)
            val valueOne=sharedPreferences.getString("key1","Wrong1")
            val valueTwo=sharedPreferences.getString("key2","Wrong2")
            Log.d("testt",valueOne!!)
            Log.d("testt",valueTwo!!)
        }
        findViewById<TextView>(R.id.update).setOnClickListener {
            val sharedPreferences=getSharedPreferences("table_name", Context.MODE_PRIVATE)
            val editor:SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("key1","hello hello")//기존에 사용했어 같은 키를 사용해서 데이터 업데이트
            editor.commit()


        }
        findViewById<TextView>(R.id.delete).setOnClickListener{
            val sharedPreferences=getSharedPreferences("table_name", Context.MODE_PRIVATE)
            val editor:SharedPreferences.Editor = sharedPreferences.edit()
            editor.clear()
            editor.commit()
        }
    }
}