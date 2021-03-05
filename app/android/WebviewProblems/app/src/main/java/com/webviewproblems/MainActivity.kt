package com.webviewproblems

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.webviewproblems.ui.theme.WebviewProblemsTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WebviewProblemsTheme {
                Surface(color = Color.White) {
                    SplitView(topView = { WebviewView() }) {
                        Surface(Modifier.fillMaxSize()) {
                            Text("Hi there")
                        }
                    }
                }
            }
        }
    }
}
