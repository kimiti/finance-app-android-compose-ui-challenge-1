package com.example.financeapp.Activities.DashboardActivity.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.financeapp.R

@Composable
fun BottomNavigationBar(onItemSelected: (Int) -> Unit, modifier: Modifier = Modifier) {
    NavigationBar(
        containerColor = colorResource(R.color.lightBlue),
        modifier = modifier
            .fillMaxWidth()
            .height(80.dp)
    ) {

    }
}