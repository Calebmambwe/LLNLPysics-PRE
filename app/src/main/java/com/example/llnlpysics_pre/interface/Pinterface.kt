package com.example.llnlpysics_pre.`interface`

interface Pinterface {
    interface DataView{
        abstract var result: Any

        fun initView()
        fun updateView()
    }
    interface Presenter{
        fun increamentValue()
        fun getCounter():String
    }
    interface DataModel{
        fun incrementCounter()
        fun getCounter():Int
    }
}