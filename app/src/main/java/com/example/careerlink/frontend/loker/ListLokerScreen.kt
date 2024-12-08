package com.example.careerlink.frontend.loker

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careerlink.frontend.component.BottomBar
import com.example.careerlink.frontend.component.ButtonAction
import com.example.careerlink.frontend.component.CardAction
import com.example.careerlink.frontend.component.CardList
import com.example.careerlink.frontend.component.TopBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ListLokerScreen(modifier: Modifier = Modifier) {
    val listLoker = listOf(
        Loker("PTNBH UNAND", "Software Development", "Bekerja sebagai pengembang perangkat lunak", "01 Desember 2024"),
        Loker("Loker Software Engineer", "Engineer", "Membuat aplikasi skala besar", "02 Desember 2024"),
        Loker("Loker Designer", "UI/UX", "Mendesain antarmuka aplikasi", "03 Desember 2024"),
        Loker("Loker Designer", "UI/UX", "Mendesain antarmuka aplikasi", "03 Desember 2024"),
        Loker("Loker Data Scientist", "AI/ML", "Analisis data untuk pengambilan keputusan", "04 Desember 2024")
    )
    Scaffold(
        topBar = {
            TopBar("Lowongan Kerja")
        },
        bottomBar = {
            BottomBar()
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = modifier
                .padding(paddingValues)
                .padding(horizontal = 16.dp)
        ) {
            item {
                Spacer(modifier = Modifier.height(8.dp))

            }
            items(listLoker) { loker ->
                CardList(
                    title = loker.title,
                    subtitle = loker.subtitle,
                    desk = loker.desk,
                    date = loker.date
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

data class Loker(
    val title: String,
    val subtitle: String,
    val desk: String,
    val date: String
)

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ListLokerPrev() {
    ListLokerScreen()
}