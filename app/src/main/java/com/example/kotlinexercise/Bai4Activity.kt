package com.example.kotlinexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bai4.*

class Bai4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai4)

        btnReturn3.setOnClickListener {
            val intent = Intent(this, Bai3Activity::class.java)
            startActivity(intent)
            finish()
        }
        btnKQ4.setOnClickListener {
            if (txthoTen.text.isEmpty() ||txtEmail.text.isEmpty() || txtLop.text.isEmpty() || txtMSSV.text.isEmpty()){
                Toast.makeText(this, "Vui lòng nhập đủ các trường", Toast.LENGTH_SHORT).show()
            }else{
                sinhvien()
            }

        }

    }
    private fun sinhvien(){
        var hoTen : SinhVien = SinhVien(txthoTen.text.toString(), txtMSSV.text.toString(), txtLop.text.toString(), txtEmail.text.toString())
        Toast.makeText(this, "${hoTen.hoTen} - ${hoTen.email} - ${hoTen.MSSV} - ${hoTen.lop}", Toast.LENGTH_SHORT).show()
    }
}