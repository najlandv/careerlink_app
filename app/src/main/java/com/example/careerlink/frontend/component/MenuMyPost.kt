package com.example.careerlink.frontend.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.careerlink.R
import androidx.compose.runtime.setValue


@Composable
fun MenuMyPost(menuActive: String = "Magang", modifier: Modifier = Modifier) {
    var activeMenu by remember { mutableStateOf(menuActive) } // Menyimpan menu yang aktif

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        ButtonMenu(
            text = "Magang",
            backgroundColor = if (activeMenu == "Magang") colorResource(R.color.button_yellow_selected) else colorResource(R.color.button_yellow),
            textColor = if (activeMenu == "Magang") colorResource(R.color.black) else colorResource(R.color.white),
            onClick = { activeMenu = "Magang" } // Set tombol aktif
        )
        ButtonMenu(
            text = "Sertifikasi",
            backgroundColor = if (activeMenu == "Sertifikasi") colorResource(R.color.button_yellow_selected) else colorResource(R.color.button_yellow),
            textColor = if (activeMenu == "Sertifikasi") colorResource(R.color.black) else colorResource(R.color.white),
            onClick = { activeMenu = "Sertifikasi" } // Set tombol aktif
        )
        ButtonMenu(
            text = "Loker",
            backgroundColor = if (activeMenu == "Loker") colorResource(R.color.button_yellow_selected) else colorResource(R.color.button_yellow),
            textColor = if (activeMenu == "Loker") colorResource(R.color.black) else colorResource(R.color.white),
            onClick = { activeMenu = "Loker" } // Set tombol aktif
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun MenuMyPostPrev() {
    MenuMyPost()
}