package com.example.bankui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material.icons.rounded.List
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankui.ui.theme.Purple40

@Composable
fun FinanceSection() {
    Column (
        modifier = Modifier
            .padding(10.dp)
    ) {
        Text(
            text = "Finance",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(4.dp)
        )
        Row {
            Box(
                modifier = Modifier
                    .padding(10.dp)
                .clip(shape = RoundedCornerShape(10.dp))

            ) {
                Column(
                    modifier = Modifier
                        .background(Purple40)
                        .padding(10.dp)
                        .width(80.dp)

                ) {
                    Image(imageVector = Icons.Rounded.Star, contentDescription = null)
                    Text(text = "My Business",
                        fontSize = 20.sp,
                        color = Color.White
                    )
                }

            }
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
            ) {
                Column(
                    modifier = Modifier
                        .background(Purple40)
                        .padding(10.dp)
                        .width(80.dp)

                ) {
                    Image(imageVector = Icons.Rounded.List, contentDescription = null)
                    Text(text = "Finance Analysis",
                        fontSize = 20.sp,
                        color = Color.White

                    )
                }

            }
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
            ) {
                Column(
                    modifier = Modifier
                        .background(Purple40)
                        .padding(10.dp)
                        .width(80.dp)

                ) {
                    Image(imageVector = Icons.Rounded.MailOutline, contentDescription = null)
                    Text(text = "My Wallet",
                        fontSize = 20.sp,
                        color = Color.White

                    )
                }

            }
        }
    }

}