package com.example.mylibrary.ejemplo_solid_2

import android.util.Log

class Project {

    var documents: List<Document> = listOf(Document(),ReadOnlyDocument())

    fun apenAll(){
        documents.forEach { document ->
            Log.i("", "Open File")
        }
    }

    fun saveAll(){
        documents.forEach { document ->
            if (document is ReadOnlyDocument)
            Log.i("", "Save File")
        }
    }

}