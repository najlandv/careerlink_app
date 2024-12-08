package com.example.careerlink.frontend.magang

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careerlink.frontend.component.ButtonMenu
import com.example.careerlink.frontend.component.CardList
import com.example.careerlink.frontend.component.TopBar

data class InternshipData(
    val title: String,
    val description: String,
    val date: String
)

@Composable
fun ListMagangScreen(
    modifier: Modifier = Modifier
) {
    val magangList = listOf(
        InternshipData(
            title = "GrowMentor",
            description = "Pengembang Perangkat Lunak (Software Developer Intern)",
            date = "2024-02-03"
        ),
        InternshipData(
            title = "PT Telkom Indonesia",
            description = "Pengembang Perangkat Lunak (Software Developer Intern)",
            date = "2024-02-03"
        ),
        InternshipData(
            title = "PT Angkasa Pura",
            description = "Pengembang Perangkat Lunak (Software Developer Intern)",
            date = "2024-02-03"
        ),
        InternshipData(
            title = "PT Angkasa Pura",
            description = "Pengembang Perangkat Lunak (Software Developer Intern)",
            date = "2024-02-03"
        ),

    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TopBar(
            text = "Magang",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(magangList.size) { index ->
                val magang = magangList[index]
                CardList(
                    title = magang.title,
                    subtitle = "Posisi Magang:",
                    desk = magang.description,
                    date = magang.date
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ListMagangScreenPrev() {
    ListMagangScreen()
}
