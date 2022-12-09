package com.beatrice.calculatorapp.presentation.view.components

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.view.setMargins
import com.beatrice.calculatorapp.R

fun CalculatorSymbol(context: Context, symbol: Drawable?): Button =
    Button(context, null, R.attr.customButtonStyle).apply {
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        params.setMargins(16)
        setCompoundDrawablesWithIntrinsicBounds(symbol, null, null, null)
        layoutParams = params

    }