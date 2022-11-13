package com.cmh.lovetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {


    var datalist = arrayListOf(
        DataRecycler(R.drawable.home, "0번"),
        DataRecycler(R.drawable.home, "1번"),
        DataRecycler(R.drawable.home, "2번"),
        DataRecycler(R.drawable.home, "3번"),
        DataRecycler(R.drawable.home, "4번"),
        DataRecycler(R.drawable.home, "5번"),
        DataRecycler(R.drawable.home, "6번"),
        DataRecycler(R.drawable.home, "7번"),
        DataRecycler(R.drawable.home, "8번"),
        DataRecycler(R.drawable.home, "9번"),
        DataRecycler(R.drawable.home, "10번"),
        DataRecycler(R.drawable.home, "11번")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(datalist, this)
    }

    fun recyclerClick(curData:DataRecycler){
        Toast.makeText(this, curData.name, Toast.LENGTH_SHORT).show()
    }
}