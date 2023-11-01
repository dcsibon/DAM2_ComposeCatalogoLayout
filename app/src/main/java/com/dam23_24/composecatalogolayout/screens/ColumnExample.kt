package com.dam23_24.composecatalogolayout.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
fun MyColumn1() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Ejemplo 1",
            fontSize = 30.sp,
            modifier = Modifier
                .background(Color.Red)
                .weight(1f)
                .wrapContentHeight(align = Alignment.Top)
                .align(Alignment.Start)
        )
        Text(
            text = "Ejemplo 2",
            fontSize = 30.sp,
            textAlign = TextAlign.End,
            modifier = Modifier
                .background(Color.Gray)
                .fillMaxWidth()
                .weight(2f)
                .wrapContentHeight(align = Alignment.CenterVertically)
        )
        Text(
            text = "Ejemplo 3",
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Cyan)
                .width(180.dp)
                .weight(2f)
                .wrapContentHeight(align = Alignment.CenterVertically)
        )
        Text(
            text = "Ejemplo 4",
            fontSize = 30.sp,
            textAlign = TextAlign.End,
            modifier = Modifier
                .background(Color.Green)
                .weight(1f)
                .padding(horizontal = 40.dp)
                .wrapContentHeight(align = Alignment.Bottom)
                .align(Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MyColumn2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            "Ejemplo 1",
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(400.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
        )
        Text(
            "Ejemplo 2",
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Gray)
                .fillMaxWidth()
                .height(400.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
        )
        Text(
            "Ejemplo 3",
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .height(400.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
        )
        Text(
            "Ejemplo 4",
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(400.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
        )
    }
}