package com.cmh.lovetest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import  androidx.appcompat.app.AppCompatActivity
import com.cmh.lovetest.tabbar.TabbarMainActivity
import com.cmh.lovetest.tablayout.TablayoutMainActivity

class SubActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sub_main)

        var btn2:Button = findViewById<Button>(R.id.btn2)


        var l = View.OnClickListener {             Log.d("cmhtest","SubActivity - View.OnClickListener")
        }
        btn2.setOnClickListener(l)


        findViewById<Button>(R.id.btn3).setOnClickListener {
//            startActivity()
            var intent = Intent(this, MainActivity::class.java)
            intent.putExtra("test","값을 넘기는거야.")
            startActivity(intent)
        }
    }


    public fun btn1Onclick(view:View){
        Log.d("cmhtest","SubActivity - btnOnclick")
        var toast = Toast.makeText(this, "ㅋㅋ", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.END, 10,10)
        toast.show()
    }

    public fun btn2Onclick(view:View){
        Log.d("cmhtest","SubActivity - btnOnclick")
        var toast = Toast.makeText(this, "ㅋㅋ", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.END, 10,10)
        toast.show()
    }


    public fun clickScroll(view:View){
        Log.d("cmhtest","SubActivity - clickScroll")
//        var toast = Toast.makeText(this, "clickScroll", Toast.LENGTH_SHORT)
//        toast.setGravity(Gravity.END, 10,10)
//        toast.show()

        var intent = Intent(this, ScrollActivity::class.java)
        startActivity(intent)

    }

    public fun clickListView(view:View){
        Log.d("cmhtest","SubActivity - clickScroll")
//        var toast = Toast.makeText(this, "clickScroll", Toast.LENGTH_SHORT)
//        toast.setGravity(Gravity.END, 10,10)
//        toast.show()

        var intent = Intent(this, ListViewActivity::class.java)
        startActivity(intent)
    }

    public fun clickRecycleView(view:View){
        Log.d("cmhtest","SubActivity - clickRecycleView")
//        var toast = Toast.makeText(this, "clickScroll", Toast.LENGTH_SHORT)
//        toast.setGravity(Gravity.END, 10,10)
//        toast.show()

        var intent = Intent(this, RecyclerViewActivity::class.java)
        startActivity(intent)
    }


    public fun clickTabbar(view:View){
        Log.d("cmhtest","SubActivity - clickTabbar")
//        var toast = Toast.makeText(this, "clickScroll", Toast.LENGTH_SHORT)
//        toast.setGravity(Gravity.END, 10,10)
//        toast.show()

        var intent = Intent(this, TabbarMainActivity::class.java)
        startActivity(intent)
    }


    public fun clickTablayout(view:View){
        Log.d("cmhtest","SubActivity - clickTablayout")
//        var toast = Toast.makeText(this, "clickScroll", Toast.LENGTH_SHORT)
//        toast.setGravity(Gravity.END, 10,10)
//        toast.show()

        var intent = Intent(this, TablayoutMainActivity::class.java)
        startActivity(intent)
    }




}