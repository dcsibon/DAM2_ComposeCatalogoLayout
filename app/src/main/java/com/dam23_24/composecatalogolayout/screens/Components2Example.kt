package com.dam23_24.composecatalogolayout.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.text.DecimalFormat

/**
 * Slider: Nos permiten seleccionar un rango, por defecto el rango va de 0 a 1.
 */
@Preview(showBackground = true)
@Composable
fun BasicSlider() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp, vertical = 100.dp)
    ) {
        var sliderPosition by rememberSaveable { mutableStateOf(0f) }

        val dec = DecimalFormat("#.##")
        val porcentaje = dec.format(100 * sliderPosition)

        Slider(value = sliderPosition, onValueChange = { sliderPosition = it })
        Text(text = porcentaje.toString())
    }
}

/**
 * Slider: También podemos forzar que se mueva en unos valores enteros
 * y una serie de puntos exactos, por ejemplo de 0 a 10, con paso 1.
 */
@Composable
fun AdvanceSlider() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp, vertical = 100.dp)
    ) {

        var sliderPosition by rememberSaveable { mutableStateOf(0f) }
        var completeValue by rememberSaveable { mutableStateOf("") }

        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            onValueChangeFinished = { completeValue = sliderPosition.toString() },
            valueRange = 0f..10f,
            steps = 9,
            enabled = true
        )
        Text(text = completeValue)
    }
}
