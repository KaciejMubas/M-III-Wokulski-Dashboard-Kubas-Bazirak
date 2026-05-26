package com.example.wokolskidashboard.model

data class Transaction(
    val title: String,
    val amount: Double,
    val isExpense: Boolean
)

/*enum class Flag(val rodzaj: String){
    WYDATEK("wydatek"),
    PRZYCHOD("przychod")

}*/

// Boolean flagi:
// True = Wydatek
// False = Przychód

data class Transaction (var nazwa: String, var kwota: Double, var flagRodzaj: Boolean, var Potrzebne: Boolean? = false)
{

}
