package com.dam23_24.composecatalogolayout.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
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

@Preview(showBackground = true)
@Composable
fun MyRow2() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Text1",
            fontSize = 20.sp,
            modifier = Modifier
                .background(Color.Red)
                .weight(1f)
                .wrapContentWidth(align = Alignment.Start)
                .align(Alignment.Top)
        )
        Text(
            text = "Text2",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Gray)
                .fillMaxHeight()
                .weight(1f)
                .wrapContentHeight(align = Alignment.Bottom)
        )
        Text(
            text = "Text3",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Cyan)
                .width(180.dp)
                .weight(1f)
        )
        Text(
            text = "Text4",
            fontSize = 20.sp,
            textAlign = TextAlign.End,
            modifier = Modifier
                .background(Color.Green)
                .weight(1f)
                .height(100.dp)
                .align(Alignment.Bottom)
        )
    }
}