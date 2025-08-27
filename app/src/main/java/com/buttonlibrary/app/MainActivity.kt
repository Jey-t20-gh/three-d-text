package com.buttonlibrary.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.buttonlibrary.app.ui.theme.ButtonLibraryTheme
import com.buttonlibrary.three_d_text.ThreeDText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ButtonLibraryTheme {
                ThreeDText(
                    text = "Sample Text",
                    modifier = Modifier.wrapContentSize()
                )
            }
        }
    }
}

//@Composable
//fun T() {
//    androidx.compose.foundation.layout.Box(
//        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        T(
//            text = " PRETTY \n COOL RIGHT !",
//            modifier = Modifier.wrapContentSize(),
//            baseColor = androidx.compose.ui.graphics.Color(0xFF000000),
//            depthColor = androidx.compose.ui.graphics.Color(0xFFBEBEBE),
//            depthOffset = Offset(1f, 1f),
//            shadowColor = androidx.compose.ui.graphics.Color(0xFFC0C0C0),
//            shadowOffset = Offset(3f, 3f),
//            shadowBlurRadius = 1f,
//        )
//    }
//}

@Preview(showBackground = true)
@Composable
fun PreviewText(){
    ButtonLibraryTheme {
//        T()
    }
}
