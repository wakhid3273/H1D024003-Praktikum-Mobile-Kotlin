package com.example.pertemuan_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.pertemuan_1.ui.screen.DaftarProductScreen
import com.example.pertemuan_1.ui.theme.Pertemuan_1Theme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan_1Theme {
                DaftarProductScreen()
            }
        }
    }
}
