package com.example.androidstep2.data

class Node<T>(value: T){
    var value:T = value
    var next: Node<T>? = null
    var previous:Node<T>? = null
}