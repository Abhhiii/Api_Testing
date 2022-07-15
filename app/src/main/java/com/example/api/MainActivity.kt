package com.example.api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getDataFile()
    }

    private fun getDataFile() {
        val data= DataService.dataInstance.getDataitems(1)

        data.enqueue(object : Callback<DataFile>{
            override fun onFailure(call: Call<DataFile>, t: Throwable) {
                Log.d("Failure","Its error",t)

            }

            override fun onResponse(call: Call<DataFile>, response: Response<DataFile>) {

                val data= response.body()
                if (data!=null){
                    Log.d("Success", data.toString())
                }

            }


        })



    }
}