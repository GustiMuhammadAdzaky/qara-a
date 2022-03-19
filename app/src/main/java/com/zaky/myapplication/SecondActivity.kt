package com.zaky.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class SecondActivity : AppCompatActivity() {

    private lateinit var rvGridNabi: RecyclerView
    private var list: ArrayList<Nabi> = arrayListOf()
//    private var title: String = "List Pahlawan"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        rvGridNabi = findViewById(R.id.rv_horizontal)
        list.addAll(RvData.listData)

        showRecyclerCardView()

        supportActionBar?.hide()

    }

    private fun showRecyclerCardView() {
//        rvGridNabi.layoutManager = LinearLayoutManager(this)
        rvGridNabi.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val viewHorizontalAdapter = ViewHorizontalAdapter(list)
        rvGridNabi.adapter = viewHorizontalAdapter
        viewHorizontalAdapter.setOnItemClickCallback(object : ViewHorizontalAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Nabi) {
//                showSelectedSkinCare(data)
            }
        })
    }



    fun undoButton(view: View) {
        finish()
    }
}
