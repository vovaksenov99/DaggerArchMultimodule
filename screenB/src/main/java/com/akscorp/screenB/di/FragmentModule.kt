package com.akscorp.screenB.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.akscorp.screenB.presentation.ScreenBViewModel
import com.akscorp.core.di.ViewModelFactory
import com.akscorp.core.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class FragmentModule {

    @Binds
    @IntoMap
    @ViewModelKey(ScreenBViewModel::class)
    abstract fun homeViewModel(viewModel: ScreenBViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
