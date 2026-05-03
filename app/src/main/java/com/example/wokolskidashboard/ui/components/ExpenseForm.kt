package com.example.wokolskidashboard.ui.components

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ExpenseForm(onExpenseAdd: (String, Double, Boolean) -> Unit)
{
    var titleWydat by remember { mutableStateOf("")}
    var titleKwota by remember { mutableStateOf("")}
    var wydatPotrzebny by remember { mutableStateOf(false)}
    var Validity = titleWydat.isBlank() && (titleKwota.toDoubleOrNull() ?: 0.00) > 0
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primaryContainer)
    )
    {
        Column(
            verticalArrangement = Arrangement.Top,
        )
        {
            WokulskiTextField(
                titleWydat,
            {titleWydat = it},
                "Nazwa Wydatku"
                )
            WokulskiTextField(
                titleKwota,
                {titleKwota = it},
                "Nazwa Wydatku"
            )
            Switch(
                modifier = Modifier.padding(20.dp),
                checked = wydatPotrzebny,
                onCheckedChange = {
                    wydatPotrzebny = it
                }
            )
            WokulskiButton(
               text = "Dodaj Wydatek!",

                enabled = Validity,

                onClick = {
                    val kwota = titleKwota.toDouble()
                    val title = titleWydat
                    val potrz = wydatPotrzebny
                    onExpenseAdd(title,kwota,potrz)
                }

            )
        }
    }
}