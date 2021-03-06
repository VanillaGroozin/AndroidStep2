package com.example.androidstep2.presentation.activity

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.androidstep2.R
import com.example.androidstep2.data.Student

class MainActivity : AppCompatActivity() {

    var students: ArrayList<Student> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initializeData()
        setTopStudents()
        palindromeCheck("anna")
    }

    private fun palindromeCheck(str: String) {
        var palindrome = this.findViewById(R.id.palindrome) as TextView;
        if (str == str.reversed())
            palindrome.text = "Palindrome"
        else
            palindrome.text = "Not palindrome"
    }

    private fun setTopStudents() {

        students.sortBy { std -> std.mark }
        var topstudent1 = this.findViewById(R.id.topstudent1) as TextView;
        var topstudent2 = this.findViewById(R.id.topstudent2) as TextView;
        var topstudent3 = this.findViewById(R.id.topstudent3) as TextView;
        topstudent1.text = students[students.size-1].mark.toString();
        topstudent2.text = students[students.size-2].mark.toString();
        topstudent3.text = students[students.size-3].mark.toString();
    }


    private fun initializeData() {
        students.add(Student("Student1", "i hate this", "1", 1, Bitmap.createBitmap(100, 100,
            Bitmap.Config.ARGB_8888)))
        students.add(Student("Student2", "i hate this", "2", 2, Bitmap.createBitmap(100, 100,
            Bitmap.Config.ARGB_8888)))
        students.add(Student("Student3", "i hate this", "3", 3,Bitmap.createBitmap(100, 100,
            Bitmap.Config.ARGB_8888)))
        students.add(Student("Student4", "i hate this", "4", 4,Bitmap.createBitmap(100, 100,
            Bitmap.Config.ARGB_8888)))
        students.add(Student("Student5", "i hate this", "5", 5,Bitmap.createBitmap(100, 100,
            Bitmap.Config.ARGB_8888)))
        students.add(Student("Student6", "i hate this", "1", 4,Bitmap.createBitmap(100, 100,
            Bitmap.Config.ARGB_8888)))
        students.add(Student("Student7", "i hate this", "2", 3,Bitmap.createBitmap(100, 100,
            Bitmap.Config.ARGB_8888)))
        students.add(Student("Student8", "i hate this", "3", 2,Bitmap.createBitmap(100, 100,
            Bitmap.Config.ARGB_8888)))
    }


}

