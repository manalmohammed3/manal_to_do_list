package com.example.manal_to_do_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.manal_to_do_list.databinding.FragmentSecondBinding
import com.google.android.material.datepicker.MaterialDatePicker
import kotlinx.android.synthetic.main.fragment_second.view.*
import kotlinx.android.synthetic.main.item.view.*
import java.text.SimpleDateFormat
import java.util.*

class secondFragment : Fragment() {

    private var binding:FragmentSecondBinding?=null

    fun showDatePicker() {

        val datePicker = MaterialDatePicker.Builder.datePicker()
            .setTitleText("Select date").setSelection(MaterialDatePicker.todayInUtcMilliseconds())
            .build()

        datePicker.show(parentFragmentManager, "DatePicker")
        datePicker.addOnPositiveButtonClickListener {

            calender = readDate(it, "dd/MM/yyyy")
            binding?.dataPicker?.setText(calender)

        }


    }
    private fun readDate(setDate: Long, datePattern: String): String {
        val format = SimpleDateFormat(datePattern, Locale.getDefault())
        return format.format(Date(setDate))
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding?.root
    }







    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.id
        binding!!.id.setOnClickListener {
            view.findNavController().navigate(R.id.action_secondFragment_to_todolistFragment)
        }
    }




    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    }


