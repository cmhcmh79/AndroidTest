package com.cmh.lovetest.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.cmh.lovetest.R
import com.cmh.lovetest.tabbar.TabbarMainActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.tabbar_main_activity.viewPager
import kotlinx.android.synthetic.main.tablayout_main_activity.*

class TablayoutMainActivity : AppCompatActivity() {


    private val tabTitleArray = arrayOf(
        "Home",
        "Favorite",
        "Profile"
    )
    private val tabIconArray  = arrayOf(
        R.drawable.ic_baseline_home_white_24,
        R.drawable.ic_baseline_favorite_24,
        R.drawable.ic_baseline_person_24
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tablayout_main_activity)

        viewPager.adapter = TabbarMainActivity.ViewPagerAdapter(this)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = tabTitleArray[position]

//            tab.icon = ContextCompat.getDrawable(this, tabIconArray[position])
        }.attach()

        tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_baseline_home_white_24)
        tabLayout.getTabAt(1)?.setIcon(R.drawable.ic_baseline_favorite_24)
        tabLayout.getTabAt(2)?.setIcon(R.drawable.ic_baseline_person_24)


    }

}