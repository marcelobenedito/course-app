package com.github.marcelobenedito.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val name: Int,
    val associatedCourses: Int,
    @DrawableRes val imageResourceId: Int
)
