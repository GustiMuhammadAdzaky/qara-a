package com.zaky.myapplication

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar

class BookmarkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookmark)

        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.actionbar_bookmark)
//        setActionBarTitle(title)

        val bar: ActionBar? = supportActionBar
        bar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#ffffff")))
    }

    fun undoButton(view: View) {
        finish()
    }
}
