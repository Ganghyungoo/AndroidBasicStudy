package com.example.fastcampus3

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)
        val currentThread=Thread.currentThread()
        Log.d("testt",""+currentThread)

/*        Thread{
            for(i in 1..1000){
                Log.d("testt","A"+i)
            }
        }.start()

        Thread{
            for(j in 1..1000){
                Log.d("testt","B"+j)

            }
        }.start()*/
        Thread{
            val currentThread=Thread.currentThread()
            Log.d("testt","A"+currentThread)
            findViewById<TextView>(R.id.test).text="changed"
            //UI관련 작업을 메인 쓰레드가 아닌 쓰레드에서 하려고하면 해당 작업을 메인쓰레드의 queue로 돌아간다
            //->에러가 발생하지 않을 수도 있다.

        }.start()

    }
}