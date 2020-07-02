package com.example.androidstep2.viewholder

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.androidstep2.data.StudentsGroup

import kotlinx.android.synthetic.main.viewholder_students_group.view.*

class StudentsGroupHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var context: Context? = null

    init {

    }
    fun initiateBind(studentGroup: StudentsGroup){
        itemView?.textview_viewholder_student_name?.text = studentGroup.student?.name
        itemView?.textview_viewholder_student_group?.text = studentGroup.name
    }
}


