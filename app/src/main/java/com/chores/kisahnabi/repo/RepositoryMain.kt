package com.chores.kisahnabi.repo

import com.chores.kisahnabi.model.ResponseMain
import com.chores.kisahnabi.network.ConfigNetwork
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class RepositoryMain {

    fun getData(respondHandler: (List<ResponseMain>) -> Unit, errorHandler: (Throwable) -> Unit){
        ConfigNetwork.service().getData().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                respondHandler(it)
            }, {
                errorHandler(it)
            })
    }
}