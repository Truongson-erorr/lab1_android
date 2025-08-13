package com.example.lab1_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab1_android.ui.theme.Lab1_androidTheme

class Cau2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab1_androidTheme {
                RelativeLayoutScreen()
            }
        }
    }
}

@Composable
fun RelativeLayoutScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // TextView ở trên cùng
        Text(
            text = "Xin chào bạn, mình là Sơn",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.align(Alignment.TopCenter)
        )

        // Button ở dưới cùng
        Button(
            onClick = { /* TODO: Xử lý khi nhấn nút */ },
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            Text(text = "Click Me")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RelativeLayoutPreview() {
    Lab1_androidTheme {
        RelativeLayoutScreen()
    }
}
