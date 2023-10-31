@file:Suppress("SpellCheckingInspection")

package com.dam23_24.composecatalogolayout

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import com.dam23_24.composecatalogolayout.ui.theme.ComposeCatalogoLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCatalogoLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyExampleSpacer()
                }
            }
        }
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



@Preview(showBackground = true)
@Composable
fun MyExampleSpacer() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Cyan)
        ) {
            Text("BOX 1", fontSize = 40.sp)
        }
        Spacer(modifier = Modifier.height(50.dp))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth().weight(1f).background(Color.LightGray)
        ) {
            Text("BOX2", fontSize = 40.sp)
        }
        Spacer(modifier = Modifier.height(100.dp))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Green)
        ) {
            Text("BOX3", fontSize = 40.sp)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Magenta)
        ) {
            Text("BOX4", fontSize = 40.sp)
        }
    }
}


@Composable
fun MyComplexLayout() {
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


@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(200.dp)
                .background(Color.Cyan),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(
                text = "Esto es un EJEMPLO  del uso de Box",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 20.dp)
            )
        }
    }
}


/*
@Preview(showBackground = true)
@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
        Box(
            modifier = Modifier
                .width(20.dp)
                .height(60.dp)
                .background(Color.Cyan)
                .verticalScroll(rememberScrollState())
        ){
            Text(text = "Esto es un EJEMPLO  del uso de Box")
        }
    }
}
*/

