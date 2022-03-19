package com.zaky.myapplication

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView




class MainActivity : AppCompatActivity() {


    private lateinit var rv: RecyclerView
    private var list: ArrayList<Nabi> = arrayListOf()
//    private var title: String = "25 Nabi & Rasul"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv = findViewById(R.id.rv_nabi)
        rv.setHasFixedSize(true)

        list.addAll(RvData.listData)
        showRecyclerCardView()
        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.custom_actionbar)
//        setActionBarTitle(title)

        val bar: ActionBar? = supportActionBar
        bar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#ffffff")))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        rv.setNestedScrollingEnabled(false);

    }

    private fun showRecyclerCardView() {
        rv.layoutManager = LinearLayoutManager(this)
//        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val cardViewAdapter = CardViewAdapter(list)
        rv.adapter = cardViewAdapter
        cardViewAdapter.setOnItemClickCallback(object : CardViewAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Nabi) {
                showSelectedSkinCare(data)
            }
        })
    }



    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        val benar = super.onBackPressed()
        return benar
    }

//    private fun setActionBarTitle(title: String) {
//        supportActionBar?.title = title
//    }

    private fun showSelectedSkinCare(nabi: Nabi) {
//        val moveWithDataIntent = Intent(this@Main2Activity, Details::class.java)
//        val nama = skinCare.nama
//        val detail = skinCare.detail
//        val photo = skinCare.photo
//
//        moveWithDataIntent.putExtra(Details.EXTRA_NAMA, "$nama")
//        moveWithDataIntent.putExtra(Details.EXTRA_DETAIL,"$detail")
//        moveWithDataIntent.putExtra(Details.EXTRA_PHOTO,photo)
//        startActivity(moveWithDataIntent)
        val moveWithDataIntent = Intent(this@MainActivity, SecondActivity::class.java)
        startActivity(moveWithDataIntent)

    }

    fun buttonPindahAdam(view: View) {
        val moveWithDataIntent = Intent(this@MainActivity, SecondActivity::class.java)
        startActivity(moveWithDataIntent)
    }


}