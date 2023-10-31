package com.dam23_24.composecatalogolayout.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun MyRow() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color.hsl(
                    hue = .35f,
                    saturation = .60f,
                    lightness = .70f,
                    alpha = .65f
                )
            )
            .horizontalScroll(rememberScrollState())
    ) {
        Text(
            "Ejemplo1",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Yellow)
                .width(150.dp)
                .height(150.dp)
                .wrapContentHeight(Alignment.CenterVertically)
        )
        Text(
            "Ejemplo2",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            modifier = Modifier
                .background(Color.Black)
                .width(150.dp)
                .height(150.dp)
                .wrapContentHeight(Alignment.CenterVertically)
        )
        Text(
            "Ejemplo3",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Cyan)
                .width(150.dp)
                .height(150.dp)
                .wrapContentHeight(Alignment.CenterVertically)
        )
        Text(
            "Ejemplo4",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.LightGray)
                .width(150.dp)
                .height(150.dp)
                .wrapContentHeight(Alignment.CenterVertically)
        )
        Text(
            "Ejemplo5",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Red)
                .width(150.dp)
                .height(150.dp)
                .wrapContentHeight(Alignment.CenterVertically)
        )
    }
}

@Composable
fun MyRow1() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            "Ejemplo 1", modifier = Modifier
                .height(300.dp)
                .border(2.dp, Color.Red)
                .padding(5.dp)
        )
        Text(
            "Ejemplo 2", modifier = Modifier
                .height(200.dp)
                .border(2.dp, Color.Blue)
                .padding(5.dp)
        )
        Text(
            "Ejemplo 3", modifier = Modifier
                .height(100.dp)
                .border(2.dp, Color.Red)
                .padding(5.dp)
        )
        Text(
            "Ejemplo 4", modifier = Modifier
                .border(2.dp, Color.Blue)
                .padding(5.dp)
        )
    }
}