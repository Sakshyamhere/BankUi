package com.example.bankui
import androidx.compose.foundation.background
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bankui.data.BottomNavigationItem

val items= listOf(
    BottomNavigationItem(
        title = "Home",
        icon = Icons.Rounded.Home
    ),
    BottomNavigationItem(
        title = "Wallet",
        icon = Icons.Rounded.MailOutline
    ),
    BottomNavigationItem(
        title = "Notifications",
        icon = Icons.Rounded.Notifications
    ),
    BottomNavigationItem(
        title = "Account",
        icon = Icons.Rounded.AccountCircle
    ),
)

@Preview
@Composable
fun BottomNavigationBar() {
    NavigationBar {
        Row (
            modifier = Modifier
                .background(MaterialTheme.colorScheme.inverseOnSurface)
        ){
            items.forEachIndexed {index , item ->
                NavigationBarItem(
                    selected = index == 0,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(imageVector = item.icon,
                            contentDescription = item.title ,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    },
                            label = {
                        Text(
                            text = item.title ,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                )}

        }
    }
}
