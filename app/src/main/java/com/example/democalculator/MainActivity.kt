package com.example.democalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var firstOperand: EditText
    private lateinit var secondOperand: EditText
    private lateinit var add: Button
    private lateinit var sub: Button
    private lateinit var multiply: Button
    private lateinit var divide: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        addListener()
    }

    private fun init() {
        firstOperand = findViewById(R.id.firstOperand)
        secondOperand = findViewById(R.id.secondOperand)
        add = findViewById(R.id.add)
        sub = findViewById(R.id.sub)
        multiply = findViewById(R.id.multiply)
        divide = findViewById(R.id.divide)
    }

    private fun addListener() {
        add.setOnClickListener {
            add()
        }

        sub.setOnClickListener {
            sub()
        }

        multiply.setOnClickListener {
            multiply()
        }

        divide.setOnClickListener {
            divide()
        }

    }

    private fun add() {
        val first = firstOperand.text.toString().toInt()
        val second = secondOperand.text.toString().toInt()
        val result = first + second
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("result", result)
        startActivity(intent)
    }

    private fun divide(){
        val first = firstOperand.text.toString().toInt()
        val second = secondOperand.text.toString().toInt()

        if (second == 0){
            Toast.makeText(this, "Can't divide by 0", Toast.LENGTH_SHORT).show()
            return
        }

        val result = first / second
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("result", result)
        startActivity(intent)
        finish()
    }

    private fun multiply(){
        val first = firstOperand.text.toString().toInt()
        val second = secondOperand.text.toString().toInt()
        val result = first * second
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("result", result)
        startActivity(intent)
    }

    private fun sub() {
        val first = firstOperand.text.toString().toInt()
        val second = secondOperand.text.toString().toInt()
        val result = first - second
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("result", result)
        startActivity(intent)
    }
}