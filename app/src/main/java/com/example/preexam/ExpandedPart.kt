package com.example.preexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ExpandedPart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expanded_part)
    }
    fun GoTosochi(view: View) {
        val intent = Intent(this, Syntwave2::class.java)
        startActivity(intent)
    }
    fun GoToislog(view: View) {
        val intent = Intent(this, Islosgact::class.java)
        startActivity(intent)
    }
}