package com.example.preexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Choosetime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choosetime)
    }

    fun GoToMath(view: View) {
        val intent = Intent(this, math1 ::class.java)
        startActivity(intent)
    }
    fun GoToRus(view: View) {
        val intent = Intent(this, Ruslang ::class.java)
        startActivity(intent)
    }
}