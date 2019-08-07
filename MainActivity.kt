package com.example.piglatinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textboxInput = findViewById(R.id.textbox) as EditText
        var submitBtn = findViewById(R.id.submit) as Button
        var outputText = findViewById(R.id.outputText) as TextView

        submitBtn.setOnClickListener{
            var str = textboxInput.text.toString()
            var output = "Error: Multiple Words"
            if (!str.contains(" ")){
                output = str.takeLast(str.length - 1) + str.take(1) + "ay"
            }
            outputText.text = output
        }
    }
}
