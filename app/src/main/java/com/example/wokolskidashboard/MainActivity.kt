package com.example.wokolskidashboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.wokolskidashboard.model.Transaction
import com.example.wokolskidashboard.ui.components.BalanceHeader
import com.example.wokolskidashboard.ui.components.ExpenseForm
import com.example.wokolskidashboard.ui.components.TransactionCard
import com.example.wokolskidashboard.ui.theme.WokolskiDashBoardTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WokolskiDashBoardTheme {
                    MainScreen(
                    )
                }
            }
        }
    }

@Composable
fun MainScreen() {
    val transactions = remember { mutableStateListOf<Transaction>() }
    val kwota = transactions.sumOf { it.kwota }

    Column {
        BalanceHeader(kwota)

        ExpenseForm { newTransaction ->
            (transactions.add(newTransaction))
        }

        //Dodaj tutaj IncomeForm

        transactions.forEach { transaction ->
            TransactionCard(transaction)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WokolskiDashBoardTheme {
        MainScreen()
    }
}
