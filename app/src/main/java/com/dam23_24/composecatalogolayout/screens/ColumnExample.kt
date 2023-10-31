package com.dam23_24.composecatalogolayout.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
fun MyColumn() {
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