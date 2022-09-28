package com.example.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

var List = mutableListOf<Int>() // список куда будут класть элементы

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (i is 1..10){
            List.add(i)
        }
        printOnScreen()
    }
    fun printOnScreen() {
        val textView: TextView = findViewByld(R.id.textView)
        textView.text = List.toString()
    }
}
