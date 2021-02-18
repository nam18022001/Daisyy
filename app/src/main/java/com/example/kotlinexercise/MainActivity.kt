package com.example.kotlinexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnTinh.setOnClickListener {
            giaiThua()
        }
        btnBai2.setOnClickListener {
            val intent = Intent(this, Bai2Activity::class.java)
            startActivity(intent)
            finish()
        }
        fun main (args:Array<String>){

            var arrayint = Array<Int>(5){0}
            var x:Int = 0
            val abc:Int = arrayint.size
            while( x < abc)
            {
                arrayint[x] = readLine()!!.toInt()
                x++
            }

            for(index in 0..4)
            {
                println(arrayint[index])
            }
        }
    }
    private fun giaiThua() {
        var gt = 1
        var n = txtNumber.text.toString().toInt()
        for (i in 1..n){
            gt *= i
        }
        txtKQ.text = gt.toString()
    }
}