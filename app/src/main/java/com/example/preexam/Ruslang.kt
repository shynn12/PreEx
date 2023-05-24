package com.example.preexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Ruslang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ruslang)
    }
    fun GoTotest(view: View) {
        val intent = Intent(this, TestPart ::class.java)
        startActivity(intent)
    }
    fun GoToExpand(view: View) {
        val intent = Intent(this, ExpandedPart ::class.java)
        startActivity(intent)
    }
}