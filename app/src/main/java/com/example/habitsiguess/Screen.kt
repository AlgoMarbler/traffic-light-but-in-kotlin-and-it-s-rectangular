package com.example.habitsiguess

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
internal fun Screen(screenData: ScreenViewState) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){
        Text(text=screenData.title)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = screenData.onClick){
            Text(text=screenData.buttonText)
        }
        TrafficLights(screenData)

    }
}

@Composable
@Preview
fun Preview_Screen() {
    Screen(
        screenData = ScreenViewState(
            title = "title",
            buttonText = "button text",
            onClick = {},
            rectangleColor = Color.Black,
            rectangleColor2 = Color.Black,
            rectangleColor3 = Color.Black,
    ))
}

@Composable
fun TrafficLights(screenData: ScreenViewState) {
    Box(
        modifier = Modifier
            .background(color = screenData.rectangleColor)
            .height(50.dp)
            .clip(CircleShape) // circle doesnt work :(
            .fillMaxSize(0.5f),
    )
    Box(
        modifier = Modifier
            .background(color = screenData.rectangleColor2)
            .height(50.dp)
            .clip(CircleShape)
            .fillMaxSize(0.5f),
    )
    Box(
        modifier = Modifier
            .background(color = screenData.rectangleColor3)
            .height(50.dp)
            .clip(CircleShape)
            .fillMaxSize(0.5f),
    )
}
