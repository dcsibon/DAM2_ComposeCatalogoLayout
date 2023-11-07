package com.dam23_24.composecatalogolayout.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dam23_24.composecatalogolayout.R


/**
 * Text: Nos permite mostrar un texto en pantalla, no es editable para el usuario,
 * pero si podemos modificar su valor desde la app.
 */
@Composable
fun MyTextExample() {
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Esto es un ejemplo 1", modifier = Modifier.padding(vertical = 15.dp))
        Text(
            text = "Esto es un ejemplo 2",
            color = Color.Blue,
            modifier = Modifier.padding(vertical = 15.dp)
        )
        Text(
            text = "Esto es un ejemplo 3",
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(vertical = 15.dp)
        )
        Text(
            text = "Esto es un ejemplo 4",
            fontWeight = FontWeight.Light,
            modifier = Modifier.padding(vertical = 15.dp)
        )
        Text(
            text = "Esto es un ejemplo 5",
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(vertical = 15.dp)
        )
        Text(
            text = "Esto es un ejemplo 6",
            textDecoration = TextDecoration.LineThrough,
            modifier = Modifier.padding(vertical = 15.dp)
        )
        Text(
            text = "Esto es un ejemplo 7",
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.padding(vertical = 15.dp)
        )
        Text(
            text = "Esto es un ejemplo 8",
            textDecoration = TextDecoration.combine(
                listOf(TextDecoration.Underline, TextDecoration.LineThrough)
            ),
            modifier = Modifier.padding(vertical = 15.dp)
        )
        Text(
            text = "Esto es un ejemplo 9", fontSize = 30.sp,
            modifier = Modifier.padding(vertical = 15.dp)
        )
    }
}


/**
 * TextField: Nos permite introducir un texto editable por el usuario
 */
@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFieldExample() {
    var myText by rememberSaveable { mutableStateOf("") }

    Column() {
        TextField(
            value = myText,
            onValueChange = { myText = it },
            label = {
                Text(text = "Introduce tu nombre")
            }
        )
    }
}


/**
 * OutlinedTextField: Similar al componente TextField, pero con un aspecto diferente.
 * Podemos modificar el color del borde cuando tenga o no el foco.
 */
@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyOutlinedTextFieldExample() {
    var myText by rememberSaveable { mutableStateOf("") }

    Column() {
        OutlinedTextField(
            value = myText,
            onValueChange = { myText = it },
            modifier = Modifier.padding(24.dp),
            label = { Text(text = "Introduce tu nombre") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Magenta,
                unfocusedBorderColor = Color.Blue
            )
        )
    }
}


/**
 * Button, OutlinedButton y TextButton: 3 tipos de botones,
 * pero el mismo funcionamiento.
 */
@Composable
fun MyButtonExample() {
    var enabled by rememberSaveable { mutableStateOf(true) }

    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { enabled = false },
            enabled = enabled,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.LightGray,
                contentColor = Color.Blue
            ),
            border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "Button1")
        }

        OutlinedButton(
            onClick = { enabled = false },
            enabled = enabled,
            modifier = Modifier.padding(top = 8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Magenta,
                contentColor = Color.Blue,
                disabledContainerColor = Color.Blue,
                disabledContentColor = Color.Red
            )
        ) {
            Text(text = "Button2")
        }

        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Button3")
        }
    }
}


/**
 * Image: Uso de imágenes.
 */
@Composable
fun MyImageExample() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 40.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Ejemplo 1",
            alpha = 0.5f
        )

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Ejemplo 2",
            alpha = 1f,
            modifier = Modifier.border(2.dp, Color.LightGray)
        )
    }
}

@Composable
fun MyImageExample2() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Ejemplo 3",
        modifier = Modifier
            .clip(CircleShape)
            .border(5.dp, Color.Red, CircleShape)
    )
}


/**
 * Icon: Uso de iconos predefinidos.
 */
@Composable
fun MyIconExample() {
    Icon(
        imageVector = Icons.Rounded.Star,
        contentDescription = "Icono de una estrella",
        tint = Color.Red
    )
}


/**
 * CircularProgressIndicator & LinearProgressIndicator.
 */
@Composable
fun MyProgressExample() {
    var showLoading by rememberSaveable { mutableStateOf(false) }

    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        if (showLoading) {
            CircularProgressIndicator(
                color = Color.Red,
                strokeWidth = 10.dp
            )
            LinearProgressIndicator(
                modifier = Modifier.padding(top = 32.dp),
                color = Color.Red,
                trackColor = Color.LightGray
            )
        }

        Button(
            onClick = { showLoading = !showLoading },
        ) {
            Text(text = "Cargar perfil")
        }
    }
}


/**
 * Switch:
 */
@Composable
fun MySwitchExample() {
    var state by rememberSaveable { mutableStateOf(false) }

    Switch(
        checked = state,
        onCheckedChange = { state = !state },
        enabled = false,
        colors = SwitchDefaults.colors(
            uncheckedThumbColor = Color.Red,
            uncheckedTrackColor = Color.Magenta,
            checkedThumbColor = Color.Green,
            checkedTrackColor = Color.Cyan,
            disabledCheckedTrackColor = Color.Yellow,
            disabledCheckedThumbColor = Color.Yellow,
            disabledUncheckedThumbColor = Color.Yellow,
            disabledUncheckedTrackColor = Color.Yellow
        )
    )

}