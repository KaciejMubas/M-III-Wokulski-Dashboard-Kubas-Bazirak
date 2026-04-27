package com.example.wokolskidashboard.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun IncomeForm(onIncomeAdded: (String, Double) -> Unit) {
    var title by remember { mutableStateOf("") }
    var amountString by remember { mutableStateOf("") }
    val isValid = title.isNotBlank() && (amountString.toDoubleOrNull() ?: 0.0) > 0.0

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ){
        Text("Księgowanie przychodów (Rzecki)", style = MaterialTheme.typography.headlineSmall)

        OutlinedTextField(
            value = title,
            onValueChange = { title = it },
            label = { Text("Towar (np. Paryskie rękawiczki)") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = amountString,
            onValueChange = { amountString = it },
            label = { Text("Kwota w rublach") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal)
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                val amount = amountString.toDoubleOrNull() ?: 0.0
                onIncomeAdded(title, amount)
                title = ""
                amountString = ""
            },
            enabled = isValid,
            modifier = Modifier.align(Alignment.End)
        ){
            Text("Dodaj Zysk")
        }
    }

}

