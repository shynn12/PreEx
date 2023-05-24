package com.example.preexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TestPart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_part)
    }
    fun GoToSynt(view: View) {
        val intent = Intent(this, SyntWaveAnalyse ::class.java)
        startActivity(intent)
    }
    fun GoToPunct(view: View) {
        val intent = Intent(this, punctuationact ::class.java)
        startActivity(intent)
    }
    fun GoToOrf(view: View) {
        val intent = Intent(this, orfeyanalizeact ::class.java)
        startActivity(intent)
    }
}