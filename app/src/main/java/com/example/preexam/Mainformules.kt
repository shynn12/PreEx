package com.example.preexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Mainformules : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainformules)
    }
    fun GoToProb(view: View) {
        val intent = Intent(this, Probability ::class.java)
        startActivity(intent)
    }
    fun GoToRoot(view: View) {
        val intent = Intent(this, rootsactivity ::class.java)
        startActivity(intent)
    }
    fun GoToDegree(view: View) {
        val intent = Intent(this, Degreeeactivity ::class.java)
        startActivity(intent)
    }
    fun GoToEqual(view: View) {
        val intent = Intent(this, Equalsactivity ::class.java)
        startActivity(intent)
    }
    fun GoToRows(view: View) {
        val intent = Intent(this, Rowsactivity ::class.java)
        startActivity(intent)
    }
    fun GoToFun(view: View) {
        val intent = Intent(this, functionactivity ::class.java)
        startActivity(intent)
    }
}