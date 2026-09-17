package com.example.androidalapok
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(
    name: String,
    modifier: Modifier = Modifier,
    clicks: Int,
)
{
    Column(
        modifier = modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(
            text = "Szia $name!"
        )
        Text(
            text = "Android tanulás!",
        )
        Row(
            modifier = Modifier
                .padding(16.dp),
            //.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Android!"
            )
            Text(
                text = "Kotlin"
            )
        }
        Card (
            modifier = Modifier.fillMaxWidth()
        ){
            StatusMessage(
                clicks = clicks
            )
        }
    }
}