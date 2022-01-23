package com.example.android.dynamicthemechange

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class ColorChangeActivity : AppCompatActivity() {
    private lateinit var mColorChangeTextView1: TextView
    private lateinit var mColorChangeTextView2: TextView
    private lateinit var mColorButton1_2: Button
    private lateinit var mColorButton3_4: Button
    private lateinit var mColorButton5_6: Button
    var colorValue: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_change)

        initializeViews()

        mColorButton_1_2OnClickListener()

        mColorButton_3_4OnClickListener()

        mColorButton_5_6OnClickListener()

        setBackgroundColors()
    }

    private fun initializeViews() {
        mColorChangeTextView1 = findViewById(R.id.color_change_textView_1)
        mColorChangeTextView2 = findViewById(R.id.color_change_textView_2)
        mColorButton1_2 = findViewById(R.id.color_1_color_2_button)
        mColorButton3_4 = findViewById(R.id.color_3_color_4_button)
        mColorButton5_6 = findViewById(R.id.color_5_color_6_button)
    }

    private fun mColorButton_1_2OnClickListener() {
        mColorButton1_2.setOnClickListener {
            colorValue = 1
            setBackgroundColors()
            Log.d("ColorChangeActivity.kt", "colorValue = 1")
        }
    }

    private fun mColorButton_3_4OnClickListener() {
        mColorButton3_4.setOnClickListener {
            colorValue = 2
            setBackgroundColors()
            Log.d("ColorChangeActivity.kt", "colorValue = 2")
        }
    }

    private fun mColorButton_5_6OnClickListener() {
        mColorButton5_6.setOnClickListener {
            colorValue = 3
            setBackgroundColors()
            Log.d("ColorChangeActivity.kt", "colorValue = 3")
        }
    }

    private fun setBackgroundColors() {
        when (colorValue) {
            1 -> {
                mColorChangeTextView1.setBackgroundColor(Color.parseColor("#FFBB86FC"))
                mColorChangeTextView2.setBackgroundColor(Color.parseColor("#FF6200EE"))
            }
            2 -> {
                mColorChangeTextView1.setBackgroundColor(Color.parseColor("#ffcc0000"))
                mColorChangeTextView2.setBackgroundColor(Color.parseColor("#ffff8800"))
            }
            else -> {
                mColorChangeTextView1.setBackgroundColor(Color.parseColor("#FF018786"))
                mColorChangeTextView2.setBackgroundColor(Color.parseColor("#ff669900"))
            }
        }
    }
}