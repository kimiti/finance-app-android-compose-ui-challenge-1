package com.example.financeapp.Repository

import com.example.financeapp.Domain.BudgetDomain
import com.example.financeapp.Domain.ExpenseDomain

class MainRepository {
    val items = mutableListOf(
        ExpenseDomain("restaurant", 573.12, "img1", "17 jun 2025 19:15"),
        ExpenseDomain("McDonald", 77.82, "img2", "16 jun 2025 13:57"),
        ExpenseDomain("Cinema", 23.47, "img3", "16 jun 2025 20:45"),
        ExpenseDomain("restaurant", 573.12, "img4", "15 jun 2025 22:18")
    )

    val budget = mutableListOf(
        BudgetDomain("Home load", 1200.0, 80.0),
        BudgetDomain("subscription", 550.0, 10.0),
        BudgetDomain("car loan", 800.0, 30.0)
    )
}