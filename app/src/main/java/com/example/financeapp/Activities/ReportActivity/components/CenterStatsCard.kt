package com.example.financeapp.Activities.ReportActivity.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun CenterStatCard(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier
            .background(Color.White, shape = RoundedCornerShape(24.dp))
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(24.dp)
            )
            .padding(12.dp)
    ) {
        val (progressBar, totalTxt, totalLabel,
            IncomeIcon, InomeLabel, IncomeValue,
            expenseIcon, expenseLabel, expenseValue) = createRefs()
    }
}


@Preview
@Composable
fun CenterStatCardPreview() {
    CenterStatCard()
}