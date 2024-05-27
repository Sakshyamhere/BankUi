package com.example.bankui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun WalletSection() {
    Row(
    modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
    Column {
        Text(
            text = "Wallet",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(4.dp)
        )

            Text(
                text = "$658.90",
                fontSize = 30.sp ,
                modifier = Modifier.
                padding(4.dp)
            )

        }
        Surface (
            modifier = Modifier
                .padding(vertical = 5.dp)
        ){
            Button(
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = "search" ,
                )
            }
        }
    }

}
