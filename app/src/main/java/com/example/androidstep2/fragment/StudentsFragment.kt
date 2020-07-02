package com.example.androidstep2.fragment

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidstep2.adapter.StudentsAdapter
import com.example.androidstep2.data.Student
import kotlinx.android.synthetic.main.fragment_students.*
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import com.example.androidstep2.R
import com.example.androidstep2.data.StudentsGroup


class StudentsFragment : Fragment(), View.OnClickListener {

    var rootView: View? = null

    var students: ArrayList<Student> = ArrayList()
    var studentsGroup: ArrayList<StudentsGroup> = ArrayList() // Контейнер с деталями

    var studentsAdapter: StudentsAdapter? = null // Рабочий на конвеере

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = LayoutInflater.from(context).inflate(
            R.layout.fragment_students,
            container,
            false)

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeViews()
        initializeData()
        initializeLayoutManager()
        initializeAdapter()
    }

    fun initializeViews(){
        recyclerview_fragment_students?.visibility = View.VISIBLE
        button_fragment_students_action?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button_fragment_students_action -> {
                Log.d("CALLED", "INVOKED")
            }
        }
    }

    fun initializeLayoutManager(){
        recyclerview_fragment_students?.layoutManager = LinearLayoutManager(context)
    }

    fun initializeAdapter(){
        studentsAdapter = StudentsAdapter(context, students, studentsGroup)
        recyclerview_fragment_students?.adapter = studentsAdapter
    }

    fun initializeData(){
        var student = Student("Vasya", "Good Student", "1")
        students.add(student)
        studentsGroup.add(StudentsGroup("First group", student))

        student = Student("John", "Bad Student","2")
        students.add(student)
        studentsGroup.add(StudentsGroup("Second group", student))

        student = Student("Log", "Average Student","3")
        students.add(student)
        studentsGroup.add(StudentsGroup("Third group", student))
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDetach() {
        super.onDetach()
    }


}