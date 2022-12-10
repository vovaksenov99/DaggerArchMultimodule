package com.akscorp.screenA.presentation

import androidx.lifecycle.ViewModel
import com.akscorp.screenA.navigation.ScreenACoordinator
import com.akscorp.screenAApi.TestAScreenData
import retrofit2.Retrofit
import javax.inject.Inject

class ScreenAViewModel @Inject constructor(
    private val data: TestAScreenData,
    private val screenACoordinator: ScreenACoordinator,
    private val retrofit: Retrofit //example
) : ViewModel() {

    fun goToScreenB(text: String) {
        data.value = text
        screenACoordinator.openBScreen()
    }

}