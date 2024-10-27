package com.example.carculatorexample

import android.content.Context
import android.graphics.Canvas
import android.graphics.LinearGradient
import android.graphics.Shader
import android.util.AttributeSet
import androidx.core.content.ContextCompat

class GradientTextButton(context: Context, attrs: AttributeSet): androidx.appcompat.widget.AppCompatButton(context,attrs) {

    private var gradient: LinearGradient? = null

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        if(w > 0) {

            val startColor = ContextCompat.getColor(context, R.color.startGradient)
            val endColor = ContextCompat.getColor(context, R.color.endGradient)

            gradient = LinearGradient(
                0f,
                0f,
                w.toFloat(),
                textSize,
                intArrayOf(startColor,endColor),
                null,
                Shader.TileMode.CLAMP
            )

        }
    }
//    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
//        super.onSizeChanged(w, h, oldw, oldh)
//
//        if(w > 0) {
//
//            val startColor = ContextCompat.getColor(context, R.color.startGradient)
//            val endColor = ContextCompat.getColor(context, R.color.endGradient)
//
//            gradient = LinearGradient(
//                0f,
//                0f,
//                w.toFloat(),
//                textSize,
//                intArrayOf(startColor,endColor),
//                null,
//                Shader.TileMode.CLAMP
//            )
//
//        }
//
//    }

    override fun onDraw(canvas: Canvas) {
        paint.shader = gradient

        super.onDraw(canvas)
    }

}