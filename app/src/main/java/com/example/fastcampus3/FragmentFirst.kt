package com.example.fastcampus3

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentFirst :Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflater:xml을 화면에 사용할 준비를 한다(xml을 뷰로 만들어준다)
        //container:프래그먼트에서 사용될 xml의 부모뷰
       val view = inflater.inflate(R.layout.first_fragment,container, false)
        //attachToRoot:루트 뷰에 붙힐지 말지(x)-틀린소리다

        view.findViewById<TextView>(R.id.call_Activity).setOnClickListener {
            (activity as FragmentActivity).printTestLog()
        }

        return view
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val data:String?=arguments?.getString("key")
        Log.d("testt","data is"+data)
    }


    fun printTestLog(){
        Log.d("testt","print test log from fragment")
    }
}