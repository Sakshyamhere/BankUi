package com.example.bankui.data

import androidx.compose.ui.graphics.Brush


data class CardItem (
    val image : Int,
    val type  : String,
    val amount : String,
    val accountNumber : String,
    val color : Brush
    )