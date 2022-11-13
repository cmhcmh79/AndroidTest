package com.cmh.lovetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    var Datalist = arrayListOf(
        Data(R.drawable.home, "0번"),
        Data(R.drawable.home, "1번"),
        Data(R.drawable.home, "2번"),
        Data(R.drawable.home, "3번")
    )

//    Reference:	@tools:sample/avatars



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        /*
        //리스트 뷰 세팅
        val item = arrayOf("0번","1번","2번","3번","4번","5번","6번","7번","8번","9번","10번","11번","12번")
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)
        
        //리스트 뷰 클릭 이벤트
        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position)
            Toast.makeText(this, selectItem.toString(), Toast.LENGTH_SHORT).show()
        }
         */

        listView.adapter = CustomAdapter(this, Datalist)


        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as Data
            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()
        }

    }
}