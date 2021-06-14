package com.example.kotlindemo

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.Spinner
import androidx.constraintlayout.widget.ConstraintLayout

class backgroundcolour : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backgroundcolour)
        var btn=findViewById<Button>(R.id.bttn)
        var colour=findViewById<Spinner>(R.id.colour)
        var lt=findViewById<ConstraintLayout>(R.id.bgnd)
        btn.setOnClickListener(View.OnClickListener {
            // Code here executes on main thread after usera presses button
            var opt=colour.selectedItem.toString()
            when(opt) {
                "Blue" -> lt.setBackgroundColor(Color.BLUE)
                "Gray" -> lt.setBackgroundColor(Color.GRAY)
                "Red" -> lt.setBackgroundColor(Color.RED)
                "Yellow" -> lt.setBackgroundColor(Color.YELLOW)
                "Green" -> lt.setBackgroundColor(Color.GREEN)
            }

        })
    }
}
