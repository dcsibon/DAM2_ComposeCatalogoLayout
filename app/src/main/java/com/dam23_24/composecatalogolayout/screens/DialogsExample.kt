package com.dam23_24.composecatalogolayout.screens

import android.app.Dialog
import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.dam23_24.composecatalogolayout.R


@Composable
fun MyScreenDialog() {
    var show by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = { show = true }) {
            Text(text = "Mostrar diálogo")
        }


        MyAlertDialog(
            show = show,
            onDissmiss = { show = false },
            onConfirm = { Log.i("MyDialog", "click") }
        )


        /*
        MySimpleDialog(show = show,
            onDissmiss = { show = false }
        )
        */

        /*
        MyCustomDialog(
            show = show,
            onDissmiss = { show = false }
        )
        */
    }
}


@Preview(showBackground = true, device = Devices.PIXEL_4_XL)
@Composable
fun MyAlertDialog(){
    var show by remember { mutableStateOf(true) }
    MyAlertDialog(show = show, {show = false},  {show = false})
}

@Composable
fun MyAlertDialog(
    show: Boolean,
    onDissmiss: () -> Unit,
    onConfirm: () -> Unit
) {
    if (show) {
        AlertDialog(
            onDismissRequest = { onDissmiss() },
            title = { Text(text = "Título") },
            text = { Text(text = "Hola, soy un ejemplo :-)") },
            confirmButton = {
                TextButton(onClick = { onConfirm() }) {
                    Text(text = "Aceptar")
                }
            },
            dismissButton = {
                TextButton(onClick = { onDissmiss() }) {
                    Text(text = "Cancelar")
                }
            }
        )
    }
}

@Composable
fun MySimpleDialog(
    show: Boolean,
    onDissmiss: () -> Unit
) {
    if (show) {
        Dialog(
            onDismissRequest = { onDissmiss() },
            //Por defecto viene a true, pero nosotros en este ejemplo vamos a forzarlo a que no pueda salir del diálogo
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = false
            )
        ) {
            Column(
                modifier = Modifier
                    .background(Color.White)
                    .padding(all = 24.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "Esto es diálogo simple")
            }
        }
    }
}


@Composable
fun MyCustomDialog(
    show: Boolean,
    onDissmiss: () -> Unit
) {
    if (show) {
        Dialog(onDismissRequest = { onDissmiss() }) {
            Column(
                modifier = Modifier
                    .background(Color.White)
                    .padding(all = 24.dp)
                    .fillMaxWidth()
            ) {
                MyTitleDialog(text = "Set backup account")
                AccountItem(email = "ejemplo1@gmail.com", drawable = R.drawable.avatar1)
                AccountItem(email = "ejemplo2@gmail.com", drawable = R.drawable.avatar2)
                AccountItem(email = "ejemplo3@gmail.com", drawable = R.drawable.avatar3)
                AccountItem(email = "Añadir nueva cuenta", drawable = R.drawable.add)
            }
        }
    }
}

@Composable
fun MyTitleDialog(text: String) {
    Text(
        text = text,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        modifier = Modifier.padding(bottom = 12.dp)
    )
}

@Composable
fun AccountItem(email: String, @DrawableRes drawable: Int) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = drawable),
            contentDescription = "avatar",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(all = 8.dp)
                .size(40.dp)
                .clip(CircleShape)
        )
        Text(
            text = email,
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}