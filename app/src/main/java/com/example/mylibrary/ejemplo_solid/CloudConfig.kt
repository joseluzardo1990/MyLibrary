package com.example.mylibrary.ejemplo_solid

interface CloudConfig {

    fun storeFile(name: String)
    fun getFile(name: String)
    fun createServer(region: String)
    fun listServer(region: String)
}