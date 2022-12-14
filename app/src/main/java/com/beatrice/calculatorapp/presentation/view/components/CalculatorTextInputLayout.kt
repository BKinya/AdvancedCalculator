package com.beatrice.calculatorapp.presentation.view.components

import android.content.Context
import android.text.InputType
import android.widget.LinearLayout.LayoutParams
import com.beatrice.calculatorapp.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

fun CalculatorTextInputLayoutLayout(context: Context): TextInputLayout =
    TextInputLayout(context, null, R.attr.customTextInputStyle).apply {
        val params = LayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.WRAP_CONTENT
        )
        params.setMargins(0, 16, 0, 16)
        layoutParams = params
        boxStrokeColor = color(R.color.blue_gray_900)
        boxStrokeWidth = 2
        boxStrokeWidthFocused = 2
        setBoxCornerRadii(96f,  48f, 48f, 96f)
        addView(CalculatorTextInputEditText(getContext()))

    }

fun CalculatorTextInputEditText(context: Context): TextInputEditText =
    TextInputEditText(context).apply {
        val params = LayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.WRAP_CONTENT
        )
        layoutParams = params
        inputType = InputType.TYPE_CLASS_NUMBER
        setTextColor(color(R.color.blue_gray_900))
    }