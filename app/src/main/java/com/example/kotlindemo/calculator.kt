package com.example.kotlindemo

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.math.pow

class calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        var btn = findViewById<Button>(R.id.calculate)
        var n1=findViewById<TextView>(R.id.num1);
        var n2=findViewById<TextView>(R.id.num2);

        var res=findViewById<TextView>(R.id.result)
        var sym=findViewById<Spinner>(R.id.symbol)


        btn.setOnClickListener(View.OnClickListener {
            // Code here executes on main thread after user presses button
            var a=0
            var b=0
            var op=0
            var temp=sym.selectedItem.toString()
            try{

                a= n1.text.toString().toInt()
                b= n2.text.toString().toInt()
                if(temp=="+")
                    op=a+b
                res.setText("Sum is $op")
                if(temp=="-")
                    op=a-b
                res.setText("Diff is $op")
                if(temp=="/")
                    op=a/b
                res.setText("Division is $op")
                if(temp=="%")
                    op=a%b
                res.setText("Modulo is $op")
                if(temp=="*")
                    op=a*b
                res.setText("Mul is $op")


            }
            catch(e:Throwable){
                res.setText("enter only symbolss[+,-,*,/,%].. \n please try again")
            }
            closeKeyboard()

        })
    }

    private fun closeKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm: InputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}
