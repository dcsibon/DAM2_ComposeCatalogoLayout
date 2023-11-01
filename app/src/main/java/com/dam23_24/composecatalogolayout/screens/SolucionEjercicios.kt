package com.dam23_24.composecatalogolayout.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true)
@Composable
fun Ejercicio1() {
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
fun Ejercicio2() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan)
                .padding(0.dp, 10.dp)
        ) {
            Text("Ejercicio 2", fontSize = 30.sp, fontWeight = FontWeight.Bold, color = Color.Blue, modifier = Modifier
                .background(Color.Yellow)
                .border(3.dp, Color.Black)
                .padding(10.dp))
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.White)
        ) {
            Box(
                contentAlignment = Alignment.BottomCenter,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Blue)
            ) {
                Text("PMDM", fontSize = 30.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Green)
            ) {
                Text("DAM 2", fontSize = 30.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray)
            }
        }
        Box(
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta)
        ) {
            Text("...Combinando Column y Box", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.Yellow)
        }
    }
}

@Composable
fun Ejercicio3() {
    Column(modifier = Modifier.fillMaxSize())
    {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Cyan)
        ) {
            Text(text = "BOX 1", fontSize = 40.sp)
        }
        Espacio(50)
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth().weight(1f).background(Color.LightGray)
        ) {
            Text(text = "BOX2", fontSize = 40.sp)
        }
        Espacio(100)
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Green)
        ) {
            Text(text = "BOX3", fontSize = 40.sp)
        }
        Espacio(20)
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Magenta)
        ) {
            Text(text = "BOX4", fontSize = 40.sp)
        }
    }
}

@Composable
fun Espacio(size: Int){
    Spacer(modifier = Modifier.height(size.dp))
}

@Composable
fun Ejercicio4() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {

        val (box1, box2, box3, box4, box5) = createRefs()

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(120.dp)
                .background(Color.Cyan)
                .constrainAs(box1) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }
        ) {
            Text(text = "Caja 1")
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(120.dp)
                .background(Color.Red)
                .constrainAs(box2) {
                    bottom.linkTo(box1.top)
                    end.linkTo(box1.start)
                }
        ) {
            Text(text = "Caja 2")
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(120.dp)
                .background(Color.Blue)
                .constrainAs(box3) {
                    bottom.linkTo(box1.top)
                    start.linkTo(box1.end)
                }
        ) {
            Text(text = "Caja 3")
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(120.dp)
                .background(Color.Green)
                .constrainAs(box4) {
                    top.linkTo(box1.bottom)
                    end.linkTo(box1.start)
                }
        ) {
            Text(text = "Caja 4")
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(120.dp)
                .background(Color.Gray)
                .constrainAs(box5) {
                    top.linkTo(box1.bottom)
                    start.linkTo(box1.end)
                }
        ) {
            Text(text = "Caja 5")
        }
    }
}