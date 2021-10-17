package com.example.top0

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.top0.Top10.APIClient
import com.example.top0.Top10.Entries.Entry
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    lateinit var myRV:RecyclerView
    private var feedApi: TOP10API? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         myRV=findViewById(R.id.myRV)

        var button = findViewById<Button>(R.id.button)
        feedApi = APIClient().getClient()?.create(TOP10API::class.java)
        button.setOnClickListener {
            requestApi()
        }
    }

    private fun requestApi() {

        CoroutineScope(Dispatchers.IO).launch {

            val data = async {

                feedApi!!.getdata()

            }.await()

            if (data != null) {

                updateAdviceText(data.body()!!.entry)
            }
        }
    }

    private suspend fun updateAdviceText(data: List<Entry>?) {
        withContext(Dispatchers.Main)
        {
            myRV.adapter=RVAdapter(data)
            myRV.layoutManager=LinearLayoutManager(this@MainActivity)

        }

    }
}







