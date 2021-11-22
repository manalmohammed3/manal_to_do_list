package com.example.manal_to_do_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.manal_to_do_list.databinding.FragmentSecondBinding
import com.example.manal_to_do_list.databinding.FragmentTodolistBinding
import com.example.manal_to_do_list.datasorce.data
import com.example.manal_to_do_list.model.datamodel
import com.example.manal_to_do_list.todoadapter.adapter
import kotlinx.android.synthetic.main.item.view.*

class todolistFragment : Fragment() {
    var dataValues = data().loadingData()
    private var binding: FragmentTodolistBinding? = null
    //lateinit var dataValues:List<datamodel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTodolistBinding.inflate(inflater,container,false)
        return binding?.root
//       val view= inflater.inflate(R.layout.fragment_todolist, container, false)
       //Toast.makeText(context, "here", Toast.LENGTH_SHORT).show()
       // view.button.setOnClickListener {   view.findNavController().navigate(R.id.action_todolistFragment_to_secondFragment) }
//        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
var         recyclerView = binding!!.rec3
        recyclerView.adapter = adapter(this.requireContext(),dataValues)
        recyclerView.setHasFixedSize(true)
    }





}