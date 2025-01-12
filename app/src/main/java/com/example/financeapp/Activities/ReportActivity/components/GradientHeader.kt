package com.example.financeapp.Activities.ReportActivity.components

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.financeapp.R

@Composable
fun GradientHeader(
    modifier: Modifier = Modifier,
    onBack: () -> Unit
) {
    ConstraintLayout(
        modifier = modifier
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        colorResource(R.color.lightBlue),
                        Color.Blue,
                        Color(0xff4b64c0)
                    ),
                    start = Offset(0f, 0f),
                    end = Offset(1000f, 600f)
                ),
                shape = RoundedCornerShape(bottomStart = 30.dp, bottomEnd = 30.dp)
            )
    ) {
        val (backBtn, title) = createRefs()

        IconButton(
            onClick = onBack,
        ) { }
    }
}


@Preview
@Composable
fun GradientHeaderPreview() {
    GradientHeader(onBack = {})
}