package com.zaky.myapplication


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        supportActionBar?.hide()

    }

    fun undoButton(view: View) {
        finish()
    }
}
