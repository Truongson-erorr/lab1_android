package com.example.lab1_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab1_android.ui.theme.Lab1_androidTheme

class cau3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab1_androidTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    TableScreen()
                }
            }
        }
    }
}

@Composable
fun TableScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TableRow(title1 = "Tên", title2 = "Tuổi", isHeader = true)
        TableRow(title1 = "Sơn", title2 = "25")
        TableRow(title1 = "Mai", title2 = "23")
    }
}

@Composable
fun TableRow(title1: String, title2: String, isHeader: Boolean = false) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(if (isHeader) Color.Gray else Color.LightGray, shape = RoundedCornerShape(8.dp))
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title1,
            fontSize = 18.sp,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = title2,
            fontSize = 18.sp,
            modifier = Modifier.weight(1f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TablePreview() {
    Lab1_androidTheme {
        TableScreen()
    }
}
