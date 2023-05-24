package com.example.preexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class geometryformules : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geometryformules)
    }
    fun GoToFormulesTriang(view: View) {
        val intent = Intent(this, triuggeomactivity ::class.java)
        startActivity(intent)
    }
    fun GoToTrap(view: View) {
        val intent = Intent(this, tapactivity ::class.java)
        startActivity(intent)
    }
    fun GoToParal(view: View) {
        val intent = Intent(this, paractivity ::class.java)
        startActivity(intent)
    }
    fun GoToCirculus(view: View) {
        val intent = Intent(this, circuleactivity ::class.java)
        startActivity(intent)
    }
}