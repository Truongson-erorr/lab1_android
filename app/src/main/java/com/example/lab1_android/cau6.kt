package com.example.lab1_android

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

// Implement OnButtonClickListener
class cau6 : ComponentActivity(), OnButtonClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout_6)

        // Tìm Button từ layout
        val btnClickMe: Button = findViewById(R.id.btnClickMe)

        // Gán sự kiện click
        btnClickMe.setOnClickListener {
            onButtonClick("Bạn vừa nhấn nút!")
        }
    }

    // Override phương thức từ Interface
    override fun onButtonClick(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
