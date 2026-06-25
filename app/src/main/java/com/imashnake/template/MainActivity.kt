package com.imashnake.template

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.imashnake.template.ui.activity.Logger
import com.imashnake.template.ui.activity.SpongeActivity
import com.imashnake.template.ui.theme.AndroidTemplateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        lifecycle.addObserver(Logger(this::class.java.simpleName))

        setContent {
            val context = LocalContext.current

            AndroidTemplateTheme {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.background)
                        .fillMaxSize()
                ) {
                    Button(
                        onClick = {
                            val intent = Intent(context, SpongeActivity::class.java)
                            context.startActivity(intent)
                        }
                    ) {
                        Text(text = "Navigate to SpongeActivity")
                    }
                }
            }
        }
    }
}
