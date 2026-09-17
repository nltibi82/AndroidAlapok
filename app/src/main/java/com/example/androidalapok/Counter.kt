package com.example.androidalapok

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Counter(
    onClick: (Int) -> Unit
) {

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
    Button(
        onClick = {
            onClick(10)
        }
    ) {
        Text(
            text = "+10",
        )

    }
    Button(
        onClick = {
            onClick(-1)
        }
    ) {
        Text(
            text = "-1",
        )

    }
}
