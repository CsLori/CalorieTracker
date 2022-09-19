package com.example.core.domain.model

data class UserInfo(
    val age: Int,
    val weight: Float,
    val height: Int,
    val gender: Gender,
    val activityLevel: ActivityLevel,
    val goalType: GoalType,
    val carbRatio: Float,
    val proteinRatio: Float,
    val fatRatio: Float,
)
