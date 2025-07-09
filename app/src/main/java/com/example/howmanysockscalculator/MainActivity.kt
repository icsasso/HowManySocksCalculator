package com.example.howmanysockscalculator

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.howmanysockscalculator.ui.theme.HowManySocksCalculatorTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spidersAmount = findViewById<EditText>(R.id.spidersAmount)
        val geeseAmount = findViewById<EditText>(R.id.geeseAmount)
        val hamstersAmount = findViewById<EditText>(R.id.hamstersAmount)
        val centipedesAmount = findViewById<EditText>(R.id.centipedesAmount)

        val totalAmountText = findViewById<TextView>(R.id.totalAmountText)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            // Convert input to integers or default to 0
            val spiders = spidersAmount.text.toString().toIntOrNull() ?: 0
            val geese = geeseAmount.text.toString().toIntOrNull() ?: 0
            val hamsters = hamstersAmount.text.toString().toIntOrNull() ?: 0
            val centipedes = centipedesAmount.text.toString().toIntOrNull() ?: 0

            // Calculate socks needed
            val totalSocks = (spiders*8) + (geese*2) + (hamsters*4) + (centipedes*100)

            // Display result
            totalAmountText.text = "$totalSocks socks"
        }


    }
}
