package com.example.mylibrary.ejemplo_solid_2

import android.util.Log

open class Document {

    lateinit var name: String
    lateinit var file: String

    fun apen(){
        Log.i("", "Open File")
    }

    fun save(){
        Log.i("", "Save File")
    }

}