package com.akscorp.screenB.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.akscorp.screenAApi.TestAScreenData
import javax.inject.Inject


class ScreenBViewModel @Inject constructor(
    data: TestAScreenData
) : ViewModel() {

    val text = MutableLiveData<String>()

    init {
        text.postValue(data.value)
    }
}