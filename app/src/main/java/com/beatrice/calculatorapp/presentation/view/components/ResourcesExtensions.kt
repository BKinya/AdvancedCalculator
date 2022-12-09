package com.beatrice.calculatorapp.presentation.view.components

import android.view.View
import androidx.core.content.ContextCompat

fun View.color(colorId: Int) = ContextCompat.getColor(this.context,colorId)

fun View.drawable(drawableId: Int)= ContextCompat.getDrawable(this.context, drawableId)
