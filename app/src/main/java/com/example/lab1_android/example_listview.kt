package com.example.lab1_android

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity
import com.example.lab1_android.R.id.sondepzai

class example_listview : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview)

        // Lấy ListView từ giao diện
        var ListView: ListView= findViewById(R.id.sondepzai)
        
        // Tạo danh sách dữ liệu mẫu
        var data = listOf("Cao","Niên", "Trường", "Sơn");

        // Tạo Adapter để kết nối dữ liệu
        var adapter= ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            data
        )

        // Gắn Adapter vào ListView
        ListView.adapter= adapter

    }
}
