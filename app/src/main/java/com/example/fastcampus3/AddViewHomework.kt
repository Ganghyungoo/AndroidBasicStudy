package com.example.fastcampus3

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat

class AddViewHomework : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_view_homework)
        var personlist:MutableList<Person> = mutableListOf<Person>()
        for(p in 0..10){
            personlist.add(Person(""+p+"번쨰 사람",""+"010-1111-111"+p))
        }
        val container=findViewById<LinearLayoutCompat>(R.id.container)
        val inflaterhere=LayoutInflater.from(this)
        personlist.forEach {
            val itemView=inflaterhere.inflate(R.layout.homework_addview,null)
            val personImage=itemView.findViewById<ImageView>(R.id.person_Image)
            val personName=itemView.findViewById<TextView>(R.id.person_name)
            val personTel=itemView.findViewById<TextView>(R.id.person_tel)

            personImage.setImageDrawable(resources.getDrawable(R.drawable.blue_background,this.theme))
            personName.text=it.name
            personTel.text=it.tel
            container.addView(itemView)

            itemView.setOnClickListener{

            }
        }
    }
}
class Person(val name:String, val tel:String){

}