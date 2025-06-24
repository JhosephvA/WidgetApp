package com.example.widgetapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.example.widgetapp.ui.theme.WidgetAppTheme

class WorkActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WidgetAppTheme {
                Text("Bienvenido a WorkActivity")
            }
        }
    }
}
