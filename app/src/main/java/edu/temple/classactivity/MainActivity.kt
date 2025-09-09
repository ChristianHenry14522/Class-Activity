package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.messageTextView)
        val textView = findViewById<EditText>(R.id.editTextText)

        findViewById<Button>(R.id.button).setOnClickListener {
            if (editText.text.isNotEmpty()) {
                "Hello, " + editText.text + "! Welcome."
            }

        } else {
            "Please enter your mame."



        }


    }
}