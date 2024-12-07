package com.example.careerlink.frontend.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careerlink.R

@Composable
fun TopBar(
    text: String,
    modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(colorResource(R.color.white))
            .height(36.dp),

        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            painter = painterResource(id = R.drawable.baseline_arrow_back_24), // Ganti dengan resource Anda
            contentDescription = "Back",
            tint = Color.Black,
            modifier = Modifier
                .size(24.dp)
                .padding(start = 8.dp)
        )
        Spacer(modifier=Modifier.width(16.dp))
        Text(
            text = text,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
    }
}

@Preview
@Composable
private fun TopBarPrev() {
    TopBar(
        text = "Postingan Saya"
    )
}
