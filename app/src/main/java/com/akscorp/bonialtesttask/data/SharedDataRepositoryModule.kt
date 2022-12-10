package com.akscorp.bonialtesttask.data

import com.akscorp.screenAApi.TestAScreenData
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SharedDataRepositoryModule {

    @Singleton
    @Provides
    fun sharedEditTextModel(): TestAScreenData = TestAScreenData("")

}


