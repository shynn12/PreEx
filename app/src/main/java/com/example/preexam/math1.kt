package com.example.preexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class math1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math1)
    }
    fun GoToFormulesM(view: View) {
        val intent = Intent(this, Mainformules ::class.java)
        startActivity(intent)
    }
    fun GoToTheoremeG(view: View) {
        val intent = Intent(this, theoremGeom ::class.java)
        startActivity(intent)
    }
    fun GoToFormulesG(view: View) {
        val intent = Intent(this, geometryformules ::class.java)
        startActivity(intent)
    }
}