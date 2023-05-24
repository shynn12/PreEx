package com.example.preexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class theoremGeom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theorem_geom)
    }
    fun GoToStInf(view: View) {
        val intent = Intent(this, GeomStGeoInf::class.java)
        startActivity(intent)
    }
    fun theorTrianact(view: View) {
        val intent = Intent(this, theorTrianact::class.java)
        startActivity(intent)
    }
    fun GoToFourAngle(view: View) {
        val intent = Intent(this, fourangelsact::class.java)
        startActivity(intent)
    }
    fun GoTocirculuses(view: View) {
        val intent = Intent(this, circulusact::class.java)
        startActivity(intent)
    }
}