package com.dam23_24.composecatalogolayout.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun SimpleRecyclerView() {
    val myList = listOf("Marta", "Antonio", "Julia", "David")

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item { Text(text = "Primer item") }
        items(7) {
            Text(text = "Este es el item $it")
        }
        items(myList){
            Text(text = "Hola, me llamo $it")
        }
    }
}