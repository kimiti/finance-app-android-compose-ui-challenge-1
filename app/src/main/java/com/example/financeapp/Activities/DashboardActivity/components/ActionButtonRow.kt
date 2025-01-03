package com.example.financeapp.Activities.DashboardActivity.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.financeapp.R

@Preview
@Composable
fun ActionButtonRow() {
    Row(
        modifier = Modifier
            .padding(vertical = 16.dp)
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        ActionButton(R.drawable.btn_1, "Deposit")
    }
}

@Composable
fun RowScope.ActionButton(icon: Int, text: String) {
    Column(
        modifier = Modifier
            .weight(1f)
    ) {

    }
}