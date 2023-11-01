package com.dam23_24.composecatalogolayout.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
@Preview(showBackground = true)
fun ConstraintExample() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {

        val (box1, box2, box3, box4) = createRefs()

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
    }
}


/**
 * Ejemplo de uso de las guías en Compose
 */
@Preview(showBackground = true)
@Composable
fun ConstraintExampleGuide() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {

        val boxRed = createRef()

        //Línea guía en el 10% desde arriba y 20% desde la izquierda
        val topGuide = createGuidelineFromTop(0.1f)
        val startGuide = createGuidelineFromStart(0.2f)

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Red)
            .constrainAs(boxRed){
                top.linkTo(topGuide)
                start.linkTo(startGuide)
            })
    }
}

/**
 * Ejemplo de uso de las barreras en Compose
 */
@Preview(showBackground = true)
@Composable
fun ConstraintExampleBarrier() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {

        val (boxRed, boxBlue, boxYellow) = createRefs()
        val barrier = createEndBarrier(boxRed, boxBlue)

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Red)
            .constrainAs(boxRed){
                start.linkTo(parent.start, margin = 16.dp)
            })

        Box(modifier = Modifier
            .size(250.dp)
            .background(Color.Blue)
            .constrainAs(boxBlue){
                top.linkTo(boxRed.bottom)
                start.linkTo(parent.start, margin = 32.dp)
            })

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow){
                start.linkTo(barrier)
            })
    }
}