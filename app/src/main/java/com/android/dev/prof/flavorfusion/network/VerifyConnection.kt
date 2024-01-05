package com.android.dev.prof.flavorfusion.network

import android.content.Context
import android.net.ConnectivityManager

class VerifyConnection(val context: Context) {
    private var isInternetConnected = false

    fun isConnected(): Boolean{
        val connectivityManager = this.context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        if (networkInfo != null){
            isInternetConnected = networkInfo.isConnected
        }else{
            isInternetConnected = false
        }

        return isInternetConnected
    }

}