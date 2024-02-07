package com.example.currencyconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView1: TextView;
    lateinit var editText: EditText;
    lateinit var button: Button;
    lateinit var textView2: TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView1=findViewById(R.id.textview1)
        textView2=findViewById(R.id.textview2)
        editText=findViewById(R.id.editText)
        button=findViewById(R.id.button)
        button.setOnClickListener{
            var usd:String=editText.text.toString()
            var usd_double:Double=usd.toDouble()
            var rupees_int:Double=convertorupees(usd_double)
            var rupees:String=rupees_int.toString();
            textView2.text="$rupees Rupees"
        }
    }
    fun convertorupees(usd:Double):Double{
        return usd*82.94
    }
}