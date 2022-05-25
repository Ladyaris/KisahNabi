package com.chores.kisahnabi.network

import com.chores.kisahnabi.model.ResponseMain
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET

interface ServiceApi {

    @GET("api/kisahnabi")
    fun getData(): Flowable<List<ResponseMain>>
}