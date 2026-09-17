package com.example.androidalapok

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(
    name: String,
    modifier: Modifier = Modifier,
    onClick: (Int) -> Unit,
    clicks: Int
)
{
    Column(
        modifier = modifier
            .fillMaxHeight()
            .padding(16.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(
            text = "Szia $name!"
        )
        Spacer(
            modifier = Modifier
                .weight(1f)
        )
        Text(
            text = "Android tanulás!",
        )
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Android!"
            )
            Text(
                text = "Kotlin"
            )
        }
        Counter(
            //clicks = clicks,
            onClick = onClick
        )
        Text (
            text = if (clicks >= 10) {
                "Kezdek belejönni! 😎"
            } else {
                "Még tanulok..."
            }
        )

    }
}