package com.example.fastcampus3

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ViewControl_02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_control02)

        val textViewOne: TextView =findViewById(R.id.textViewOne)
        val buttonOne:Button=findViewById(R.id.buttonOne)
        Log.d("testt",textViewOne.text.toString())

        //Listener 사용방법
/*        buttonOne.setOnClickListener{
            //버튼이 클릭되었을 때 동작할 코드
            Log.d("testt","버튼 클릭!!")
        }*/
        val clickListener=object:View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d("testt","버튼클릭!!!")
            }
        }
        buttonOne.setOnClickListener(clickListener)

    //축약버젼1(익명 함수)
        buttonOne.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                Log.d("testt","버튼 클릭!!")
            }
        })

    //람다버전
    buttonOne.setOnClickListener{
        Log.d("testt","버튼클릭")
    }

    }
}