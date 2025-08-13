package com.example.lab1_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab1_android.ui.theme.Lab1_androidTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab1_androidTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 134.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Xin chào bạn, mình là Sơn",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { /* Xử lý sự kiện click */ }) {
            Text("Click Me")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    Lab1_androidTheme {
        MainScreen()
    }
}
