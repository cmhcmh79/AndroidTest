package com.cmh.lovetest.tabbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.cmh.lovetest.R
import kotlinx.android.synthetic.main.tabbar_main_activity.*


class TabbarMainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tabbar_main_activity)

        viewPager.adapter = ViewPagerAdapter(this)

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                when(position){
                    0 ->  bottomNavigationView.selectedItemId = R.id.home
                    1 ->  bottomNavigationView.selectedItemId = R.id.favorite
                    2 ->  bottomNavigationView.selectedItemId = R.id.profile
                }
                super.onPageSelected(position)
            }
        })

        bottomNavigationView.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.home ->  viewPager.setCurrentItem(0)
                R.id.favorite ->  viewPager.setCurrentItem(1)
                R.id.profile ->  viewPager.setCurrentItem(2)
            }

            return@setOnItemSelectedListener true
        }
    }


    class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

        override fun getItemCount(): Int = 3

        override fun createFragment(position: Int): Fragment {
            return when(position) {
                0 -> TabbarHomeFragment()
                1 -> TabbarProfileFragment()
                else -> TabbarFavoriteFragment()
            }
        }
    }


}