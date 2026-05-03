package com.example.wokolskidashboard.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun BalanceHeader(modifier: Modifier = Modifier)
{
    var kwota by remember { mutableStateOf(0)}
    Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.primaryContainer)
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ) {
            Text(
                text = ("Dzień Dobry!"),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = (" Kwota naszego skelpu wynosi: ${kwota}"),
                fontSize = 19.sp,
                fontWeight = FontWeight.Medium,

            )
            Button(
                onClick = {kwota += 1}
            ) {
                Text("Add")
            }

        }

    }
}