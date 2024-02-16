package com.example.fastcampus3

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

class StudentsFromServer(
    val id:Int,
    val name:String,
    val age:Int,
    val intro:String
){
    constructor( name:String, age: Int, intro: String):this(0,name,age,intro)
}

interface RetrofitService {
    @GET("json/students")
    fun getStudentList(): Call<ArrayList<StudentsFromServer>>

    @POST("json/students/")
    fun createStudent(
        @Body params:HashMap<String,Any>
    ):Call<StudentsFromServer>

    @POST("json/students/")
    fun easyCreateStudent(
        @Body student :StudentsFromServer
    ):Call<StudentsFromServer>
}