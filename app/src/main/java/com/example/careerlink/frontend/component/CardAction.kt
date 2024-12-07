package com.example.careerlink.frontend.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardAction(modifier: Modifier = Modifier) {
    Card(modifier = Modifier.padding(16.dp)
        .fillMaxWidth(),
        colors = CardDefaults.cardColors(Color(0xFFFFDE59)),
    ) {
        Column(modifier = Modifier.padding(24.dp),
            verticalArrangement = Arrangement.SpaceBetween) {
            Column() {
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("Judul Card",
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
                Text("SUB JUDULNYA :",
                    style = TextStyle(
                        fontWeight = FontWeight.W500,
                        fontSize = 16.sp
                    )
                )
                Text("shfkshiufhesiu fihiu iufheuihis ifieuh siukuiieub iu siubiu iusi biub iusf",
                    style = TextStyle(
                        fontWeight = FontWeight.W500,
                        fontSize = 16.sp
                    )
                )
            }
            Spacer(modifier = Modifier.height(24.dp))

            Text("20-11-2024",
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
    CardAction()
}