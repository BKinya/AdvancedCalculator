package com.beatrice.calculatorapp.presentation.view.components

import android.content.Context
import android.view.Gravity
import android.widget.LinearLayout
import androidx.core.view.setMargins
import com.beatrice.calculatorapp.R

fun CalculatorSymbolsLayout(context: Context): LinearLayout = LinearLayout(context).apply {
    val params = LinearLayout.LayoutParams(
        LinearLayout.LayoutParams.MATCH_PARENT,
        LinearLayout.LayoutParams.WRAP_CONTENT
    )
    params.setMargins(16)

    orientation = LinearLayout.HORIZONTAL
    layoutParams = params
    gravity = Gravity.CENTER_HORIZONTAL

    val addSymbol = CalculatorSymbol(context, drawable(R.drawable.ic_add))
    val minusSymbol = CalculatorSymbol(context, drawable(R.drawable.minus))
    val multiplySymbol = CalculatorSymbol(context, drawable(R.drawable.close))
    val divideSymbol = CalculatorSymbol(context, drawable(R.drawable.slash_forward))
    addView(addSymbol)
    addView(minusSymbol)
    addView(multiplySymbol)
    addView(divideSymbol)
}