package com.example.habitsiguess

import androidx.compose.ui.graphics.Color


data class ScreenViewState(
    val title: String,
    val buttonText: String,
    val onClick: () -> Unit,
    val rectangleColor: Color,
    val rectangleColor2: Color,
    val rectangleColor3: Color,
)
