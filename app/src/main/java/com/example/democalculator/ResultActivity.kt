package com.example.democalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        init()
    }

    private fun init() {
        result = findViewById(R.id.resultView)
        val resultValue = intent.getIntExtra("result", 0)
        result.text = resultValue.toString()
    }

}