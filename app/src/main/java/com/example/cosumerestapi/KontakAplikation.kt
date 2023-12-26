package com.example.cosumerestapi


import android.app.Application
import com.example.cosumerestapi.repositori.AppContainer
import com.example.cosumerestapi.repositori.KontakContainer

class KontakAplikation: Application() {
    lateinit var container: AppContainer
    override fun onCreate(){
        super.onCreate()
        container = KontakContainer()
    }
}