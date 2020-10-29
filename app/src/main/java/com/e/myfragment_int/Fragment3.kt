package com.e.myfragment_int

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer

class Fragment3 : Fragment() {

    companion object {
        fun newInstance() = Fragment3()
    }

    private lateinit var viewModel: Fragment3ViewModel
    private lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment3_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Fragment3ViewModel::class.java)

        // 2
        viewModel._data0.observe(viewLifecycleOwner, Observer {
            // called every time when live data changes
            textView.text = it
        })


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<View>(R.id.frag3_button)
        val editText = view.findViewById<EditText>(R.id.frag3_edit)
        textView = view.findViewById<EditText>(R.id.frag3_text)

        // 0
        button.setOnClickListener(View.OnClickListener {
            val str0 = editText.text.toString()
            viewModel.addData0(str0)
        })
    }

}