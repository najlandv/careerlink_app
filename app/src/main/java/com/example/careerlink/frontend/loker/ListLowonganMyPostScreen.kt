package com.example.careerlink.frontend.loker

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careerlink.R
import com.example.careerlink.frontend.component.BottomBar
import com.example.careerlink.frontend.component.CardAction
import com.example.careerlink.frontend.component.MenuMyPost
import com.example.careerlink.frontend.component.TopBar

@Composable
fun ListLowonganMyPostScreen(modifier: Modifier = Modifier) {
    val listLoker = listOf(
        Loker("PTNBH UNAND", "Software Development", "Bekerja sebagai pengembang perangkat lunak", "01 Desember 2024"),
        Loker("Loker Software Engineer", "Engineer", "Membuat aplikasi skala besar", "02 Desember 2024"),
        Loker("Loker Designer", "UI/UX", "Mendesain antarmuka aplikasi", "03 Desember 2024"),
        Loker("Loker Designer", "UI/UX", "Mendesain antarmuka aplikasi", "03 Desember 2024"),
        Loker("Loker Data Scientist", "AI/ML", "Analisis data untuk pengambilan keputusan", "04 Desember 2024")
    )

    Scaffold(
        topBar = {TopBar("Postingan Saya")},
        bottomBar = { BottomBar()},
        floatingActionButton = { Button(modifier = Modifier,
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.button_blue),
                contentColor = colorResource(id = R.color.white)
            ),
            shape = RoundedCornerShape(24.dp),){ Icon(Icons.Default.Add,"add")}}
    ) {
        paddingValues ->
        LazyColumn(
            modifier = Modifier.padding(paddingValues)
                .padding(horizontal = 16.dp)
        ) {
            item {
                Spacer(modifier = Modifier.padding(vertical = 4.dp))
                MenuMyPost("Loker")
                Spacer(modifier = Modifier.padding(vertical = 4.dp))

            }
            items(listLoker) { loker ->
                CardAction (
                    title = loker.title,
                    subtitle = loker.subtitle,
                    desk = loker.desk,
                    date = loker.date,
                    onEdit = {},
                    onDeleteConfirmed = {}
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ListLowonganMyPostPrev() {
    ListLowonganMyPostScreen()
}