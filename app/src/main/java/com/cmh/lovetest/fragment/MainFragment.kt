package com.cmh.lovetest.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.cmh.lovetest.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {
    lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("cmhtest","MainFragment - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("cmhtest","MainFragment - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("cmhtest","MainFragment - onResume")
    }

    //Activity running

    override fun onPause() {
        super.onPause()
        Log.d("cmhtest","MainFragment - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("cmhtest","MainFragment - onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("cmhtest","MainFragment - onDestroy")
    }

    //Activity shut down

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        btn_next.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_questionFragment)
        }
    }

    companion object {
    }


}