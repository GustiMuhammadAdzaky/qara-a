package com.zaky.myapplication


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class SecondActivity : AppCompatActivity() {

    private lateinit var rvGridNabi: RecyclerView
    private var list: ArrayList<Nabi> = arrayListOf()
//    private var title: String = "List Pahlawan"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        rvGridNabi = findViewById(R.id.rv_horizontal)
        list.addAll(RvData.listData)

        val btn_click_me = findViewById(R.id.btn_bookmark) as FloatingActionButton

        showRecyclerCardView()


//        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        supportActionBar?.hide()




        btn_click_me.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@SecondActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }

    }






    private fun showRecyclerCardView() {
//        rvGridNabi.layoutManager = LinearLayoutManager(this)
        rvGridNabi.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val viewHorizontalAdapter = ViewHorizontalAdapter(list)
        rvGridNabi.adapter = viewHorizontalAdapter
        viewHorizontalAdapter.setOnItemClickCallback(object :
            ViewHorizontalAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Nabi) {
//                showSelectedSkinCare(data)
            }
        })
    }



//    fun buttonPindahGambar(view: View) {
//        btn_click_me.
//    }





    fun undoButton(view: View) {
        finish()
    }

}
