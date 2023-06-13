package com.example.llnlpysics_pre.model

import com.example.llnlpysics_pre.`interface`.Pinterface

class MainActivityModel: Pinterface.DataModel {
    private var counter = 0
    override fun incrementCounter() {
       counter++
    }

    override fun getCounter(): Int {
       return counter
    }
}