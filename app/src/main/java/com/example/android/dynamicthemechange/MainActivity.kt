package com.example.android.dynamicthemechange

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var mButtonToColorChangeActivity: Button
    private lateinit var mFirstTextView: TextView
    private lateinit var mSecondTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeViews()

        setOnGoToColorChangeActivityButtonClickListener()
    }

    private fun initializeViews() {
        mButtonToColorChangeActivity = findViewById(R.id.go_to_color_change_activity_button)
        mFirstTextView = findViewById(R.id.first_textView)
        mSecondTextView = findViewById(R.id.second_textView)
    }

    private fun setOnGoToColorChangeActivityButtonClickListener() {
        mButtonToColorChangeActivity.setOnClickListener {
            val intentToColorChangeActivity =
                Intent(this@MainActivity, ColorChangeActivity::class.java)
            startActivity(intentToColorChangeActivity)
        }
    }
}