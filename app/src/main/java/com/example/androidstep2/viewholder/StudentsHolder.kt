package com.example.androidstep2.viewholder

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.androidstep2.data.Student
import kotlinx.android.synthetic.main.viewholder_student.view.*

// Каркас
class StudentsHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    var context: Context? = null

    init { }

    fun initiateBind(student: Student){
        itemView?.textview_viewholder_student_name?.text = student.name
        itemView?.textview_viewholder_student_description?.text = student.description
    }

}