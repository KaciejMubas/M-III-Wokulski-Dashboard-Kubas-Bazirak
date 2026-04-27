package com.example.wokolskidashboard.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun IncomeForm(onIncomeAdded: (String, Double) -> Unit) {
    var title by remember { mutableStateOf("") }
    var amountString by remember { mutableStateOf("") }
    val isValid = title.isNotBlank() && (amountString.toDoubleOrNull() ?: 0.0) > 0.0

}

