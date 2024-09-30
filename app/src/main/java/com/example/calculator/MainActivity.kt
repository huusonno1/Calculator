package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberA = findViewById<EditText>(R.id.numberA)
        val numberB = findViewById<EditText>(R.id.numberB)
        val result = findViewById<TextView>(R.id.answer)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSub = findViewById<Button>(R.id.btnSub)
        val btnMul = findViewById<Button>(R.id.btnMul)
        val btnDiv = findViewById<Button>(R.id.btnDiv)

        btnAdd.setOnClickListener {
            val a = numberA.text.toString().toDoubleOrNull()
            val b = numberB.text.toString().toDoubleOrNull()
            result.text = if (a != null && b != null) (a + b).toString() else "Vui lòng nhập số hợp lệ"
        }

        btnSub.setOnClickListener {
            val a = numberA.text.toString().toDoubleOrNull()
            val b = numberB.text.toString().toDoubleOrNull()
            result.text = if (a != null && b != null) (a - b).toString() else "Vui lòng nhập số hợp lệ"
        }

        btnMul.setOnClickListener {
            val a = numberA.text.toString().toDoubleOrNull()
            val b = numberB.text.toString().toDoubleOrNull()
            result.text = if (a != null && b != null) (a * b).toString() else "Vui lòng nhập số hợp lệ"
        }

        btnDiv.setOnClickListener {
            val a = numberA.text.toString().toDoubleOrNull()
            val b = numberB.text.toString().toDoubleOrNull()
            result.text = if (a != null && b != null && b != 0.0) (a / b).toString() else "Không chia cho 0"
        }
    }
}

