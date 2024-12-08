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

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ListLokerScreen(modifier: Modifier = Modifier) {
    val listLoker = listOf(
        "PTNBH UNAND",
        "Loker Software Engineer",
        "Loker Designer",
        "Loker Data Scientist"
    )
    Scaffold(
        modifier = Modifier.padding(top = 64.dp),
        topBar = {

        },
        bottomBar = {
            BottomBar()
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = modifier.padding(16.dp)
        ) {
            item {
                ButtonAction(text = "Tambah Postingan") { }
                Spacer(modifier = Modifier.height(8.dp))
            }
            items(listLoker) { loker ->
                CardAction(title = loker, onEdit = {})
                Spacer(modifier = Modifier.height(8.dp))

            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ListLokerPrev() {
    ListLokerScreen()
}