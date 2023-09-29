package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        val imgPear: ImageView = findViewById(R.id.imageView2)
        imgPear.setImageResource(R.drawable.pear)
    }

    var isImageOn = false
    fun onClickImage(view: View) {
        val imgBtn: ImageButton = findViewById(R.id.button_image)
        if(!isImageOn) imgBtn.setImageResource(R.drawable.btn_check_buttonless_on)
        else imgBtn.setImageResource(R.drawable.btn_check_buttonless_off)
        isImageOn = !isImageOn
    }
}