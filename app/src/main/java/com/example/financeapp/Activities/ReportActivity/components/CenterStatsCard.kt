package com.example.financeapp.Activities.ReportActivity.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.financeapp.R

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
            incomeIcon, incomeLabel, incomeValue,
            expenseIcon, expenseLabel, expenseValue) = createRefs()

        CircularProgressBar(
            progress = 60f,
            max = 100f,
            color = colorResource(R.color.blue),
            backgroundColor = colorResource(R.color.lightGrey),
            stroke = 15.dp,
            modifier = Modifier
                .size(175.dp)
                .constrainAs(progressBar) {
                    top.linkTo(parent.top, margin = 16.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

        Text(
            text = "$3,546.21",
            color = colorResource(R.color.darkBlue),
            fontWeight = FontWeight.Bold,
            fontSize = 21.sp,
            modifier = Modifier.constrainAs(totalTxt) {
                centerTo(progressBar)
            }
        )

        Text(
            text = "Total",
            color = colorResource(R.color.darkBlue),
            modifier = Modifier.constrainAs(totalLabel) {
                start.linkTo(totalTxt.start)
                top.linkTo(totalTxt.top)
                end.linkTo(totalTxt.end)
            }
        )

        Image(
            painter = painterResource(R.drawable.income),
            contentDescription = null,
            modifier = Modifier.constrainAs(incomeIcon) {
                top.linkTo(anchor = progressBar.bottom, margin = 16.dp)
                start.linkTo(anchor = parent.start, margin = 32.dp)
            })
    }
}


@Preview
@Composable
fun CenterStatCardPreview() {
    CenterStatCard()
}