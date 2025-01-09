package com.example.financeapp.Domain

import java.io.Serializable

data class BudgetDomain(
    val title: String,
    val price: Double= 0.0,
    val percentage: Double= 0.0,
): Serializable
