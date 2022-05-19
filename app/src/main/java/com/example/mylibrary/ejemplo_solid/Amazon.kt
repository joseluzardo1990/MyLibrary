package com.example.mylibrary.ejemplo_solid

import android.util.Log

class Amazon: CloudConfig {

    override fun storeFile(name: String) {
        Log.i("AMAZON", "file saved successfully")
    }

    override fun getFile(name: String) {
        Log.i("AMAZON", "file returned successfully")
    }

    override fun createServer(region: String) {
        Log.i("AMAZON", "server created successfully")
    }

    override fun listServer(region: String) {
        Log.i("AMAZON", "list returned successfully")
    }

}