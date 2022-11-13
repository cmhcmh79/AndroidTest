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
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.btn_next
import kotlinx.android.synthetic.main.fragment_question.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [QuestionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuestionFragment : Fragment(), View.OnClickListener {

    lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("cmhtest","QuestionFragment - onCreateView")

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("cmhtest","QuestionFragment - onViewCreated")

        navController = Navigation.findNavController(view)

//        btn_next.setOnClickListener {
//            Log.d("cmhtest","setOnClickListener")
//
////            navController.navigate(R.id.action_questionFragment_to_selectionFragment)
//            this
//        }

        btn_next.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        Log.d("cmhtest","onClick")
        when(view?.id){
            R.id.btn_next ->{
                navController.navigate(R.id.action_questionFragment_to_selectionFragment)
            }
        }
    }
}