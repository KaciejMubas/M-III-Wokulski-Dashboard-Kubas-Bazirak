package com.example.wokolskidashboard.model

/*enum class Flag(val rodzaj: String){
    WYDATEK("wydatek"),
    PRZYCHOD("przychod")

}*/

// Boolean flagi:
// True = Wydatek
// False = Przychód

data class Transaction (var nazwa: String, var kwota: Int, var flagRodzaj: Boolean?)