package com.example.financeapp.Activities.ReportActivity.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.financeapp.R


@Composable
fun SummaryColumn(modifier: Modifier = Modifier) {

}


@Preview
@Composable
fun SummaryColumnPreview() {
    SummaryColumn()
}

@Composable
fun SummaryColumn(
    title: String,
    value: String,
    percent: String,
    percentColor: Color,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(horizontal = 8.dp, vertical = 4.dp)) {
        Text(title, color = colorResource(R.color.darkBlue))
        Text(
            value, color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 19.sp,
            modifier = Modifier.padding(vertical = 4.dp)
        )
        Text(percent, color = percentColor)
    }
}