package com.example.androidstep2.data

class Student {

    var name: String = ""
    var description: String = ""
    var mark: Int = 0

    constructor(name: String, description: String, group: String, mark: Int){
        this.name = name
        this.description = description
        this.mark = mark
    }
}