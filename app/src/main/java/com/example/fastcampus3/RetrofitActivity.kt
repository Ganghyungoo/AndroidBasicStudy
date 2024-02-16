package com.example.fastcampus3

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)
        //서버 -> 읽을 수 없는 데이터-> JSON -> Gson
        //Gson:읽을 수 없는 데이터를 코틀린 객체로 변환해준다(바꿔준다)
        val retrofit= Retrofit.Builder()
            .baseUrl("http://mellowcode.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val retrofitService=retrofit.create(RetrofitService::class.java)

        retrofitService.getStudentList().enqueue(object : Callback<ArrayList<StudentsFromServer>>{
            override fun onResponse(
                call: Call<ArrayList<StudentsFromServer>>,
                response: Response<ArrayList<StudentsFromServer>>
            ) {
                if(response.isSuccessful){
                    val studenList=response.body()
                    findViewById<RecyclerView>(R.id.studentsRecyclerview).apply{
                        this.adapter=StudentListRecyclerViewAdapter(
                            studenList!!,
                            LayoutInflater.from(this@RetrofitActivity)
                            )
                        this.layoutManager=LinearLayoutManager(this@RetrofitActivity)
                    }

                }
            }

            override fun onFailure(call: Call<ArrayList<StudentsFromServer>>, t: Throwable) {
            }
        })

        findViewById<TextView>(R.id.createStudent).setOnClickListener {

            val student=HashMap<String,Any>()
            student.put("name","쿼카퀄롸")
            student.put("age",26)
            student.put("intro","퓁쉬")
            retrofitService.createStudent(student).enqueue(object:Callback<StudentsFromServer>{
                override fun onResponse(
                    call: Call<StudentsFromServer>,
                    response: Response<StudentsFromServer>
                ) {
                    if(response.isSuccessful){
                        val student=response.body()
                        Log.d("testt","서버 등록한 학생은"+student!!.name)
                    }
                }


                override fun onFailure(call: Call<StudentsFromServer>, t: Throwable) {
                    Log.d("testt","요청 실패")
                }
            })
        }
        findViewById<TextView>(R.id.easyCreateStudent).setOnClickListener {
            val student=StudentsFromServer(name="인천",age =26,intro="인천에 온걸 환영합니다")
            retrofitService.easyCreateStudent(student).enqueue(object :Callback<StudentsFromServer>{
                override fun onResponse(
                    call: Call<StudentsFromServer>,
                    response: Response<StudentsFromServer>
                ) {
                    if(response.isSuccessful){
                        val student=response.body()
                        Log.d("testt","서버 등록한 학생은"+student!!.name)
                    }
                }

                override fun onFailure(call: Call<StudentsFromServer>, t: Throwable) {
                    Log.d("testt","요청 실패")
                }
            })

        }



    }
}
class StudentListRecyclerViewAdapter(
    var studentList:ArrayList<StudentsFromServer>,
    var inflater: LayoutInflater
):RecyclerView.Adapter<StudentListRecyclerViewAdapter.ViewHolder>(){
   inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val studentName: TextView
        val studentAge:TextView
        val studentIntro:TextView
        init {
            studentName=itemView.findViewById(R.id.student_name)
            studentAge=itemView.findViewById(R.id.student_age)
            studentIntro=itemView.findViewById(R.id.student_intro)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=inflater.inflate(R.layout.student_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.studentName.text = studentList.get(position).name
        holder.studentAge.text = studentList.get(position).age.toString()
        holder.studentIntro.text = studentList.get(position).intro

    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}