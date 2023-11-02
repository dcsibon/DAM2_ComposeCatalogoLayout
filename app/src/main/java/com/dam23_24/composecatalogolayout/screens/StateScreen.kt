package com.dam23_24.composecatalogolayout.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/*
@Preview(showBackground = true)
@Composable
fun MyStateExample() {
    var counter = 0

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { counter += 1 }) {
            Text(text = "Pulsar")
        }
        Text(text = "He sido pulsado $counter veces",
            modifier = Modifier.padding(top = 30.dp))
    }
}
*/


@Preview(showBackground = true)
@Composable
fun MyStateExample() {
    val counter = remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { counter.value += 1 }) {
            Text(text = "Pulsar")
        }
        Text(text = "He sido pulsado ${counter.value} veces",
            modifier = Modifier.padding(top = 30.dp))
    }
}


/*
@Preview(showBackground = true)
@Composable
fun MyStateExample() {
    val counter = rememberSaveable { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { counter.value += 1 }) {
            Text(text = "Pulsar")
        }
        Text(text = "He sido pulsado ${counter.value} veces",
            modifier = Modifier.padding(top = 30.dp))
    }
}
*/

/*
@Preview(showBackground = true)
@Composable
fun MyStateExample() {
    var counter by rememberSaveable { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { counter += 1 }) {
            Text(text = "Pulsar")
        }
        Text(text = "He sido pulsado $counter veces",
            modifier = Modifier.padding(top = 30.dp))
    }
}
*/
