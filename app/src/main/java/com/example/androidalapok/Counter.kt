package com.example.androidalapok

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Counter(
    clicks: Int,
    onClick: (Int) -> Unit
) {
    Text(
        text = "Kattintások: ${clicks}"
    )
    Button(
        onClick = {
            onClick(1)
        }
    ) {
        Text(
            text = "+1",
        )

    }
    Button(
        onClick = {
            onClick(5)
        }
    ) {
        Text(
            text = "+5",
        )

    }
}
