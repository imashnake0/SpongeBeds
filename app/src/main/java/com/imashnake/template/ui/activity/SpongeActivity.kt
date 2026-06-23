package com.imashnake.template.ui.activity

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.imashnake.template.ui.theme.AndroidTemplateTheme

class SpongeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.auto(
                Color.argb(0xe6, 0xFF, 0xFF, 0xFF),
                Color.argb(0x80, 0x1b, 0x1b, 0x1b)
            )
        )
        setContent {
            AndroidTemplateTheme {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.background)
                        .fillMaxSize()
                ) {
                    Text(
                        text = "This is SpongeActivity",
                        color = MaterialTheme.colorScheme.onBackground
                    )
                }
            }
        }
    }
}