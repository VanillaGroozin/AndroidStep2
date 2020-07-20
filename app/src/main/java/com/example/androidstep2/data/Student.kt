package com.example.androidstep2.data

import android.graphics.Bitmap

class Student {

    var name: String = ""
    var description: String = ""
    var mark: Int = 0
    var avatar: Bitmap? = null

    constructor(name: String, description: String, group: String, mark: Int, avatar: Bitmap){
        this.name = name
        this.description = description
        this.mark = mark
        this.avatar = avatar
    }
}