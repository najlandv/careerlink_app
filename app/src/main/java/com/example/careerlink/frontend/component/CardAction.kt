package com.example.careerlink.frontend.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardAction(title: String="Judul Besar", subtitle: String="Sub judul :", desk: String="Siapa namanya dimana rumahnya nama saya firman syahputra", date: String="12-12-1212"

               ) {
    Card(modifier = Modifier
        .fillMaxWidth(),
        colors = CardDefaults.cardColors(Color(0xFFFFDE59)),
    ) {
        Column(modifier = Modifier.padding(24.dp),
            verticalArrangement = Arrangement.SpaceBetween) {
            Column() {
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(title,
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp,
                            color = Color.White
                        )
                    )
                    Row {
                        Icon(Icons.Default.Edit, contentDescription = "",
                            tint = Color.Blue
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(Icons.Default.Delete, contentDescription = "",
                            tint = Color.Red
                        )

                    }
                }
                Spacer(modifier = Modifier.height(24.dp))
                Text(subtitle,
                    style = TextStyle(
                        fontWeight = FontWeight.W500,
                        fontSize = 16.sp
                    )
                )
                Text(desk,
                    style = TextStyle(
                        fontWeight = FontWeight.W500,
                        fontSize = 16.sp

                    )
                )
            }
            Spacer(modifier = Modifier.height(24.dp))

            Text(date,
                style = TextStyle(
                    fontWeight = FontWeight.W500,
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CardActionPrev() {
    CardAction(
        title = TODO(),
        subtitle = TODO(),
        desk = TODO(),
        date = TODO()
    )
}