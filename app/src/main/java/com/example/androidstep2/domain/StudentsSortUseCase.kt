package com.example.androidstep2.domain

import com.example.androidstep2.data.Student

class StudentsSortUseCase {
    fun initiateSortStudentsByName(students: ArrayList<Student>) : ArrayList<Student>? {
        return students.apply { sortBy{student ->  student.name} }
    }

    fun initiateSortStudentsRandom(students: ArrayList<Student>) : ArrayList<Student>? {
        return students.apply { shuffle() }
    }
}