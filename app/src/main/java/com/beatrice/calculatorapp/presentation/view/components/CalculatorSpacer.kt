package com.beatrice.calculatorapp.presentation.view.components

import android.content.Context
import android.view.View
import android.widget.LinearLayout

fun CalculatorSpacer(context: Context, width: Int = 0, height: Int = 0): View = View(context).apply {
    val params = LinearLayout.LayoutParams(
        width, height
    )
    layoutParams = params
}