package com.example.careerlink.frontend.magang

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careerlink.frontend.component.ButtonAction
import com.example.careerlink.frontend.component.CardAction
import com.example.careerlink.frontend.component.TopBar

data class MagangData(
    val title: String,
    val description: String,
    val date: String
)

@Composable
fun ListPostMagangSayaScreen(
    modifier: Modifier = Modifier,
    onEditMagang: (MagangData) -> Unit
) {
    var magangList by remember {
        mutableStateOf(
            listOf(
                MagangData(
                    title = "Software Engineer Intern",
                    description = "Magang pengembangan perangkat lunak di perusahaan teknologi.",
                    date = "2024-01-15"
                ),
                MagangData(
                    title = "Data Analyst Intern",
                    description = "Magang analisis data di startup fintech.",
                    date = "2023-12-01"
                ),
                MagangData(
                    title = "UI/UX Designer Intern",
                    description = "Magang desain antarmuka pengguna di studio desain.",
                    date = "2023-11-10"
                )
            )
        )
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TopBar(
            text = "Postingan Magang Saya",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            magangList.forEach { magang ->
                CardAction(
                    title = magang.title,
                    subtitle = "Deskripsi:",
                    desk = magang.description,
                    date = magang.date,
                    onEdit = { onEditMagang(magang) },
                    onDeleteConfirmed = {
                        magangList = magangList.filterNot { it == magang }
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ListPostMagangSayaScreenPrev() {
    ListPostMagangSayaScreen(onEditMagang = {})
}
