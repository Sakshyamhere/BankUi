@file:OptIn(ExperimentalFoundationApi::class)
package com.example.bankui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankui.data.CardItem
import com.example.bankui.ui.theme.Pink40
import com.example.bankui.ui.theme.Purple40
import com.example.bankui.ui.theme.PurpleGrey40
import com.example.bankui.ui.theme.PurpleGrey80

val cardItems = listOf(
    CardItem(
        image = R.drawable.visa,
        type = "Saving",
        amount = "$ 66.78",
        accountNumber = "9087 6789 7845 4568",
        color = getGradient(Purple40 , Pink40)
    ),
    CardItem(
        image = R.drawable.visa,
        type = "Business",
        amount = "$ 376.78",
        accountNumber = "2124 6856 5847 7508",
        color = getGradient(Purple40 , PurpleGrey40)
    ),
    CardItem(
        image = R.drawable.visa,
        type = "Current",
        amount = "$ 466.78",
        accountNumber = "1104 5876 8837 3518",
        color = getGradient(Purple40 , PurpleGrey80)
    ),
)

fun getGradient(
    startColor : Color,
    endColor: Color
):Brush {
    return Brush.horizontalGradient(
        colors = listOf(startColor , endColor)
    )
}

@Composable
fun CardSection() {
    LazyRow() {
     items(cardItems.size) { index ->
         Card(index)
     }
    }
}

@Composable
fun Card(index: Int) {
    var paddingValueEnd = 0.dp
    if (index == cardItems.size - 1) {
        paddingValueEnd = 16.dp
    }
Box(
    modifier = Modifier
        .padding(start = 16.dp, end = paddingValueEnd)
        .clip(shape = RoundedCornerShape(10.dp))
) {
    Column (
        modifier = Modifier
            .background(cardItems[index].color)
            .width(230.dp)
            .height(160.dp)
            .padding(10.dp)
    ) {
        Image(
            painter = painterResource(id = cardItems[index].image),
            contentDescription = null ,
            modifier = Modifier
                .size(60.dp)
        )
            Text(
            text = cardItems[index].type,
            fontSize = 15.sp,
                color = White
                )
        Text(
            text = cardItems[index].amount,
            fontSize = 20.sp,
            color = White

        )
        Text(
            text = cardItems[index].accountNumber,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = White
        )


    }
}
}