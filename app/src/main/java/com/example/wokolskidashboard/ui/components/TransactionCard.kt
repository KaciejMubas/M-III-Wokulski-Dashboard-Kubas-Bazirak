package com.example.wokolskidashboard.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wokolskidashboard.model.Transaction

@Composable
fun TransactionCard(transaction: Transaction){
    Box(
    contentAlignment = Alignment.Center,
    modifier = Modifier
        .fillMaxWidth()
        .background(Color.hsl(239F, 0.47F, 0.68F))
        .border(3.dp, Color.hsl(245F, 0.34F, 0.31f))

    )
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ) {
        if(transaction.isExpense){
            Text( text = ("Wydatek"),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
            Text( text = (
                    if(transaction.necessary == true){
                        "Potrzebny"
                    }
                    else
                    {
                        "Zbędny"
                    }
                    ),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        else{
            Text( text = ("Zysk"),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        Text(
            text = ("${transaction.title}"),
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,

            )
        Text(
            text = (" KWOTA: ${transaction.title}"),
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,

            )
        }
    }
}