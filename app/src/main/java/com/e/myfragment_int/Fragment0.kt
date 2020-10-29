package com.e.myfragment_int

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment0.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment0 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_0, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val txt = view.findViewById<View>(R.id.frag0_text)

        txt.setOnClickListener(View.OnClickListener {
            Log.d("TAG", "text view clicked")
        })

        val button = view.findViewById<View>(R.id.frag0_button)
        button.setOnClickListener(View.OnClickListener {
            view.findNavController().navigate(R.id.action_fragment0_to_frafment1)
        })
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         * @return A new instance of fragment Fragment0.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() = Fragment0()
    }
}