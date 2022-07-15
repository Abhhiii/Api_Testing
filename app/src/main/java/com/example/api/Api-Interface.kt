package com.example.api

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


const val BASE_URL= "https://reqres.in/"

interface ApiInterface {
    @GET("api/users")
    fun getDataitems(@Query("page")page:Int): Call<DataFile>



}
object DataService{

    val dataInstance: ApiInterface
    init{
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        dataInstance = retrofit.create(ApiInterface::class.java)

    }
}

