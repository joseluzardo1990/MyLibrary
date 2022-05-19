package com.example.mylibrary.ejemplo_solid

import android.util.Log

class Dropbox: CloudConfig {

    override fun storeFile(name: String) {
        Log.i("DROPBOX", "file saved successfully")
    }

    override fun getFile(name: String) {
        Log.i("DROPBOX", "file returned successfully")
    }

    override fun createServer(region: String) {

    }

    override fun listServer(region: String) {

    }

}