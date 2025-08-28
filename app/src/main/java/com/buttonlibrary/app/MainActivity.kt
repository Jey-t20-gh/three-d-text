package com.buttonlibrary.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.tooling.preview.Preview
import com.buttonlibrary.app.ui.theme.ButtonLibraryTheme
import com.buttonlibrary.three_d_text.ThreeDText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ButtonLibraryTheme {
                SampleUsageOfThreeDText()
            }
        }
    }
}

@Composable
fun SampleUsageOfThreeDText() {
    androidx.compose.foundation.layout.Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        ThreeDText(
            text = "3D TEXT!",
            modifier = Modifier.wrapContentSize(),
            baseColor = androidx.compose.ui.graphics.Color(0xFFE7E5E5),
            depthColor = androidx.compose.ui.graphics.Color(0xFF000000),
            depthOffset = Offset(3f, 3f),
            shadowColor = androidx.compose.ui.graphics.Color(0xFF000000),
            shadowOffset = Offset(3f, 3f),
            shadowBlurRadius = 1f,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewText(){
    ButtonLibraryTheme {
        SampleUsageOfThreeDText()
    }
}
