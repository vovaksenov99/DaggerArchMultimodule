package com.akscorp.bonialtesttask.di

import android.app.Application
import com.akscorp.bonialtesttask.MainActivity
import com.akscorp.bonialtesttask.data.SharedDataRepositoryModule
import com.akscorp.screenB.di.ExternalScreenBDeps
import com.akscorp.navigation.di.CiceroneNavigationComponentApi
import com.akscorp.screenA.di.ExternalScreenADeps
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [NavigationModule::class, SharedDataRepositoryModule::class, NetworkModule::class],
    dependencies = [CiceroneNavigationComponentApi::class]
)
@Singleton
interface AppComponent :
    ExternalScreenADeps,
    ExternalScreenBDeps {

    fun inject(activity: MainActivity)

    fun inject(application: Application)
}
