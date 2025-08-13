package com.example.lab1_android

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab1_android.ui.theme.Lab1_androidTheme

class cau4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab1_androidTheme {
                RegisterScreen()
            }
        }
    }
}

@Composable
fun RegisterScreen() {
    val context = LocalContext.current // ✅ Lấy context đúng cách

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Button(
            onClick = {
                Toast.makeText(context, "Button Clicked!", Toast.LENGTH_SHORT).show() // ✅ Không còn lỗi
            },
            modifier = Modifier.padding(top = 25.dp)
        ) {
            Text(text = "Đăng ký môn học")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRegisterScreen() {
    Lab1_androidTheme {
        RegisterScreen()
    }
}
