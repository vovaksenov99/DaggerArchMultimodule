package com.akscorp.bonialtesttask

import android.app.Application
import com.akscorp.bonialtesttask.di.AppComponent
import com.akscorp.bonialtesttask.di.DaggerAppComponent
import com.akscorp.core.di.AppComponentProvider
import com.akscorp.navigation.di.DaggerCiceroneNavigationComponent

class App : Application(), AppComponentProvider {

    lateinit var baseComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        baseComponent = DaggerAppComponent
            .builder()
            .ciceroneNavigationComponentApi(DaggerCiceroneNavigationComponent.create())
            .build()
        baseComponent.inject(this)
    }

    override fun getAppComponent() = baseComponent

}