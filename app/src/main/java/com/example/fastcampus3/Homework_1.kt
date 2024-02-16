package com.example.fastcampus3

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Homework_1 : AppCompatActivity() {
    lateinit var one: Button
    lateinit var two: Button
    lateinit var three: Button
    lateinit var four: Button
    lateinit var five: Button
    lateinit var six: Button
    lateinit var seven: Button
    lateinit var eight: Button
    lateinit var nine: Button
    lateinit var zero: Button
    lateinit var ca: Button
    lateinit var plus: Button
    lateinit var start: Button
    lateinit var result: TextView
    var num:String=""
    var temp:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework1)


        findView()
        numListner()
        ca.setOnClickListener {

        }
        plus.setOnClickListener {
            num=""
           val chageInt = Integer.parseInt(result.text.toString())
            temp+=chageInt
            result.text=""

        }
        start.setOnClickListener {
            val chageInt = Integer.parseInt(result.text.toString())
            temp+=chageInt
            result.text=temp.toString()
        }
        ca.setOnClickListener {
            num=""
            temp=0
            result.text="0"
        }



    }
    fun findView(){
        one=findViewById<Button>(R.id.one)
        two=findViewById<Button>(R.id.two)
        three=findViewById<Button>(R.id.three)
        four=findViewById<Button>(R.id.four)
        five=findViewById<Button>(R.id.five)
        six=findViewById<Button>(R.id.six)
        seven=findViewById<Button>(R.id.seven)
        eight=findViewById<Button>(R.id.eight)
        nine=findViewById<Button>(R.id.nine)
        zero=findViewById<Button>(R.id.zero)
        plus=findViewById<Button>(R.id.plus)
        ca=findViewById<Button>(R.id.CA)
        start=findViewById<Button>(R.id.start)
        result=findViewById<TextView>(R.id.result)
    }
    fun numListner(){

        var numViewList:List<Button> = listOf(one,two,three,four,five,six,seven,eight,nine,zero)


        val clickSet=object: View.OnClickListener{
            override fun onClick(p0: View?) {
                num+=(p0 as Button).text
                result.text=num
            }
        }
        numViewList.forEach {
            it.setOnClickListener(clickSet)
        }

    }

}
