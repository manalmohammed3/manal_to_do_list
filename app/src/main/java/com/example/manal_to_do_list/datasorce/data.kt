package com.example.manal_to_do_list.datasorce

import com.example.manal_to_do_list.model.datamodel


class data {
        fun loadingData():List<datamodel>{
           return listOf(
               datamodel("appointment",true,"1st november at 7pm", "with nora"),
               datamodel("shopping",true,"2nd november", "at the mall"),
               datamodel("project",true,"6th november","about programing")
           )
        }
    }
