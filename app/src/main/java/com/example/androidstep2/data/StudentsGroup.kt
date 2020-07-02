package com.example.androidstep2.data

class StudentsGroup {
    var student: Student? = null
    var name: String = ""

    constructor(name: String, student: Student){
        this.name = name
        this.student = student
    }
}