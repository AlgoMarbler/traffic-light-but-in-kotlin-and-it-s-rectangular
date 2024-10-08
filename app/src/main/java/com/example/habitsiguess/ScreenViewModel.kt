package com.example.habitsiguess

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ScreenViewModel : ViewModel() {
    val viewState = mutableStateOf(
        ScreenViewState(
            title = "Red 5s, Green 2s, Yellow 1s",
            buttonText = "Start lights",
            onClick = :: fetchData,
            rectangleColor = Color.Black,
            rectangleColor2 = Color.Black,
            rectangleColor3 = Color.Black,
        )
    )

    private fun fetchData()
    {
        viewModelScope.launch {
                while(true){
                    viewState.value = viewState.value.copy(
                        rectangleColor = Color.Red,
                        rectangleColor2 = Color.Black,
                    )
                    delay(5000)
                    viewState.value = viewState.value.copy(
                        rectangleColor3 = Color.Green,
                        rectangleColor = Color.Black
                    )
                    delay(2000)
                    viewState.value = viewState.value.copy(
                        rectangleColor2 = Color.Yellow,
                        rectangleColor3 = Color.Black,
                    )
                    delay(1000)
            }
        }
    }
}