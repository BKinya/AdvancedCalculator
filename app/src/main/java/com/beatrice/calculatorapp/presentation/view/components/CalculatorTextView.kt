package com.beatrice.calculatorapp.presentation.view.components

import android.content.Context
import android.graphics.Typeface
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.beatrice.calculatorapp.R

fun CalculatorTextView(context: Context): TextView = TextView(context).apply {
    val params = LinearLayout.LayoutParams(
        LinearLayout.LayoutParams.MATCH_PARENT,
        LinearLayout.LayoutParams.WRAP_CONTENT
    )
    params.setMargins(0,16, 0, 16)
    layoutParams = params
    text = "00"
    gravity = Gravity.CENTER_HORIZONTAL
    textSize = 48F
    typeface = Typeface.SERIF
    setTextColor(ContextCompat.getColor(context, R.color.blue_gray_900))
}