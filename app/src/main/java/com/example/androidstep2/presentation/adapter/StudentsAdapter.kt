package com.example.androidstep2.presentation.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidstep2.R
import com.example.androidstep2.data.Student
import com.example.androidstep2.data.StudentsGroup
import com.example.androidstep2.presentation.viewholder.StudentsGroupHolder
import com.example.androidstep2.presentation.viewholder.StudentsHolder


class StudentsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder> {


    var context: Context? = null
    lateinit var students: ArrayList<Student>
    lateinit var studentsGroup: ArrayList<StudentsGroup>

    constructor(context: Context?, students: ArrayList<Student>, studentsGroup: ArrayList<StudentsGroup>){
        this.context = context
        this.students = students
        this.studentsGroup = studentsGroup
    }

    override fun getItemViewType(position: Int): Int {
        return position%2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view: View
        when (viewType) {
            0 ->{   view = LayoutInflater.from(context).inflate(R.layout.viewholder_student, parent, false)
                return StudentsHolder(view)
            }
            1 ->{   view = LayoutInflater.from(context).inflate(R.layout.viewholder_students_group, parent, false)
                return StudentsGroupHolder(view)
            }
            else -> throw IllegalArgumentException()
        }
    }

    override fun getItemCount(): Int {
        return students?.size ?: 0
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.d("Adapter", "onBindViewHolder")
        if (holder is StudentsHolder)
            (holder as StudentsHolder).initiateBind(students[position])
        else if (holder is StudentsGroupHolder)
            (holder as StudentsGroupHolder).initiateBind(studentsGroup[position])
    }
}