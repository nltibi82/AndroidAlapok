package com.example.androidalapok

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidalapok.ui.theme.AndroidAlapokTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var clicks by remember { mutableStateOf(0) }
            AndroidAlapokTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Tibi",
                        modifier = Modifier.padding(innerPadding),
                        onClick = {value -> clicks += value },
                        clicks = clicks
                    )
                }
            }
        }
    }
}

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
        Text(
            text = "Kattintások: ${clicks}"
        )
        Text (
            text = if (clicks >= 10) {
                        "Kezdek belejönni! 😎"
                      } else {
                          "Még tanulok..."
                    }
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
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidAlapokTheme {
        Greeting("Tibi",onClick = { }, clicks = 0)
    }
}