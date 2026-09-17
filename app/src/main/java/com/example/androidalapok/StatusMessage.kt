package com.example.androidalapok

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun StatusMessage(
    clicks: Int
) {
    Text (
        text = if (clicks >= 10) {
            "Kezdek belejönni! 😎"
        } else {
            "Még tanulok..."
        }
    )
}