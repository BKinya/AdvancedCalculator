package com.beatrice.calculatorapp.presentation.view

import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.setMargins
import com.beatrice.calculatorapp.R
import com.beatrice.calculatorapp.presentation.view.components.CalculatorLabelTv
import com.beatrice.calculatorapp.presentation.view.components.CalculatorSymbolsLayout
import com.beatrice.calculatorapp.presentation.view.components.CalculatorTextInputLayoutLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val parentLayout = LinearLayout(this).apply {
            val parentParams = LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT
            )
            parentParams.setMargins(48)
            gravity = Gravity.CENTER
            orientation = LinearLayout.VERTICAL
            layoutParams = parentParams
            val bgColor = ContextCompat.getColor(context, R.color.white)
            setBackgroundColor(bgColor)
        }


        val num1Label = CalculatorLabelTv(this, "First Number")
        val num1Til = CalculatorTextInputLayoutLayout(this)
        val num2Label = CalculatorLabelTv(this, "SecondNumber")
        val num2Til = CalculatorTextInputLayoutLayout(this)
        val symbolsLayout = CalculatorSymbolsLayout(this)
        val symbolsLabel = CalculatorLabelTv(this, "Operations")
        parentLayout.apply {
            addView(num1Label)
            addView(num1Til)
            addView(num2Label)
            addView(num2Til)
            addView(symbolsLabel)
            addView(symbolsLayout)
        }

        setContentView(parentLayout)
    }
}