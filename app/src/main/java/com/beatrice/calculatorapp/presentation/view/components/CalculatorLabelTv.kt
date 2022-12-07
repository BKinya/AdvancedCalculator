package com.beatrice.calculatorapp.presentation.view.components

import android.content.Context
import android.widget.LinearLayout.LayoutParams
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.beatrice.calculatorapp.R

fun CalculatorLabelTv(context: Context, label: String): TextView = TextView(context).apply {
    val params = LayoutParams(
        LayoutParams.MATCH_PARENT,
        LayoutParams.WRAP_CONTENT
    )
    params.setMargins(0,16, 0, 16)
    layoutParams = params
    text = label
    textSize = 17F
    setTextColor(ContextCompat.getColor(context, R.color.blue_gray_900))
}
