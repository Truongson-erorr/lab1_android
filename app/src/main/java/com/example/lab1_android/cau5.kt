package com.example.lab1_android

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class cau5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout_5)

        // Khởi tạo Button
        val myButton: Button = findViewById(R.id.myButton)

        // Sử dụng Inline Anonymous Listener để xử lý sự kiện click
        myButton.setOnClickListener {
            // Hiển thị một thông báo khi nút được nhấn
            Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}