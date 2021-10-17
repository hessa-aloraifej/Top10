package com.example.top0

import com.example.top0.Top10.Feed
import retrofit2.Response
import retrofit2.http.GET

interface TOP10API {
    @GET("RSS/topfreeapplications/limit=10/xml")
    suspend fun getdata():Response<Feed>
}







