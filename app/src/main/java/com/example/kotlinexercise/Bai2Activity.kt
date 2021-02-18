package com.example.kotlinexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bai2.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class Bai2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai2)
        btnBai1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnTinh2.setOnClickListener {
            dem()
        }
        btnBai3.setOnClickListener { 
            val intent = Intent(this, Bai3Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun dem(){
        var n = 1
        var Count = 0
        for(i in 1..100){
           if (i %5 == 0){
               Count++
           }

        }
        txtKQ2.text = Count.toString()
    }
}