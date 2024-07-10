package com.crix.kmpexample

import KoinInject
import android.app.Application

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        KoinInject(this).init()
    }
}