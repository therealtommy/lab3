package com.example.lab3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val str1 = findViewById<EditText>(R.id.editTextText)
        val str2 = findViewById<EditText>(R.id.editTextText2)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener(){
            val strok1 = str1.text.toString()
            val strok2 = str2.text.toString()

            // Прямое добавление содержимого строки 2 в строку 1
            // str1.setText(strok1 + strok2)
            // Пробежка по строке 2, добавление в конец строки 1
            val stringBuilder = StringBuilder(strok1)
            for (char in strok2)
            {
                stringBuilder.append(char)
            }
            str1.setText(stringBuilder.toString())

        }



    }
}