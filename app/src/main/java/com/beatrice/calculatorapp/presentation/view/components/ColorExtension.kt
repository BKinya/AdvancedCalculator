package com.beatrice.calculatorapp.presentation.view.components

import android.content.Context
import android.view.View
import androidx.core.content.ContextCompat

fun View.color(colorId: Int) = ContextCompat.getColor(this.context,colorId)
