package com.example.kotlinexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bai3.*
import kotlin.random.Random

class Bai3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai3)
        btnBai2.setOnClickListener {
            val intent = Intent(this, Bai2Activity::class.java)
            startActivity(intent)
            finish()
        }
        btnTinh3.setOnClickListener {
            var input = txtInputNumber.text
            if (input.isEmpty()){
                Toast.makeText(this, "Vui lòng nhập số", Toast.LENGTH_SHORT).show()
            }else {
                araay()
            }
        }
        btnBai4.setOnClickListener {
            val intent = Intent(this, Bai4Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun araay(){
        var a = 1
        var so = txtInputNumber.text.toString().toInt()
            for (i in so downTo 1){
                if (i %2 != 0){
                    Log.d("ok", "" +i)
                }
            }

    }
}