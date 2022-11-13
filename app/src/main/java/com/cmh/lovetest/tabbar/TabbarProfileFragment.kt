package com.cmh.lovetest.tabbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cmh.lovetest.R
import kotlinx.android.synthetic.main.tabbar_main_activity.*

class TabbarProfileFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tabbar_profile_fragment, container, false)
    }

}