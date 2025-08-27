package com.buttonlibrary.app

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.buttonlibrary.app.ui.theme.ButtonLibraryTheme
import com.buttonlibrary.three_d_text.ThreeDText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ButtonLibraryTheme {
                T()
            }
        }
    }
}

@Composable
fun T() {
    androidx.compose.foundation.layout.Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        ThreeDText(
            text = " PRETTY \n COOL RIGHT !",
            modifier = Modifier.wrapContentSize(),
            baseColor = androidx.compose.ui.graphics.Color(0xFF000000),
            depthColor = androidx.compose.ui.graphics.Color(0xFFBEBEBE),
            depthOffset = Offset(1f, 1f),
            shadowColor = androidx.compose.ui.graphics.Color(0xFFC0C0C0),
            shadowOffset = Offset(3f, 3f),
            shadowBlurRadius = 1f,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewText(){
    ButtonLibraryTheme {
        T()
    }
}
