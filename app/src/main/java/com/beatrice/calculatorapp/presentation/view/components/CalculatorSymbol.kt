package com.beatrice.calculatorapp.presentation.view.components

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.widget.LinearLayout
import androidx.core.view.setMargins
import com.beatrice.calculatorapp.R
import com.google.android.material.button.MaterialButton

fun CalculatorSymbol(context: Context, symbol: Drawable?): MaterialButton =

    MaterialButton(context, null, R.attr.customButtonStyle).apply {
        val params = LinearLayout.LayoutParams(
           140,
            140
        )
        params.setMargins(16)
        layoutParams = params
        icon = symbol
        iconTint = ColorStateList.valueOf(color(R.color.blue_gray_900))
        iconGravity = MaterialButton.ICON_GRAVITY_TEXT_END
        cornerRadius = 48
        strokeWidth = 2
        strokeColor = ColorStateList.valueOf(color(R.color.blue_gray_900))
        setPadding(0, 0, 17, 0)
    }