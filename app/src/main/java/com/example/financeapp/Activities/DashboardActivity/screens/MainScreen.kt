package com.example.financeapp.Activities.DashboardActivity.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.financeapp.Activities.DashboardActivity.components.HeaderSection
import com.example.financeapp.Domain.ExpenseDomain

@Composable
fun MainScreen(
    onCardClick: () -> Unit = {},
    expenses: List<ExpenseDomain>
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 70.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                HeaderSection()
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MainScreenPreview(){
    val expenses = listOf(
        ExpenseDomain("restaurant", 573.12, "img1", "17 jun 2025 19:15"),
        ExpenseDomain("McDonald", 77.82, "img2", "16 jun 2025 13:57"),
        ExpenseDomain("Cinema", 23.47, "img3", "16 jun 2025 20:45"),
        ExpenseDomain("restaurant", 573.12, "img4", "15 jun 2025 22:18")
    )
    MainScreen(expenses = expenses)
}