package com.buttonlibrary.three_d_text

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalTextApi::class)
@Composable
fun ThreeDText(
    text: String,
    modifier: Modifier = Modifier,
    // Base color of the main text
    baseColor: Color = Color.White,
    // Color of the "extruded" depth layers
    depthColor: Color = Color.Gray,
    // The offset of the depth layers, creating the 3D effect
    depthOffset: Offset = Offset(2f, 2f),
    // Color of the final drop shadow
    shadowColor: Color = Color.Black.copy(alpha = 0.5f),
    // The offset of the drop shadow
    shadowOffset: Offset = Offset(10f, 10f),
    // The blur radius of the drop shadow
    shadowBlurRadius: Float = 6f
) {
    val textMeasurer: TextMeasurer = rememberTextMeasurer()
    val textStyle = TextStyle(
        fontSize = 48.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        shadow = Shadow(
            color = shadowColor,
            offset = shadowOffset,
            blurRadius = shadowBlurRadius
        )
    )

    Box(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .drawBehind {
                val measuredText = textMeasurer.measure(
                    text = text,
                    style = textStyle,
                    softWrap = false
                )
                
                // Calculate the horizontal center position
                val xPosition = (size.width - measuredText.size.width) / 2

                // Draw the "depth" layers first
                for (i in 1 until 10) {
                    drawText(
                        textLayoutResult = measuredText,
                        color = depthColor,
                        topLeft = Offset(
                            x = xPosition + depthOffset.x * i,
                            y = depthOffset.y * i
                        )
                    )
                }

                // Draw the main, top layer of text
                drawText(
                    textLayoutResult = measuredText,
                    color = baseColor,
                    topLeft = Offset(xPosition, 0f)
                )
            }
    )
}

