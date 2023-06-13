package com.example.llnlpysics_pre.presenter

import com.example.llnlpysics_pre.`interface`.Pinterface
import com.example.llnlpysics_pre.model.MainActivityModel

class MainActivityPresenter(view:Pinterface.DataView): Pinterface.Presenter {
    private var view:Pinterface.DataView =view
    private var model: Pinterface.DataModel = MainActivityModel()

    init{
        view.initView()
    }
    override fun increamentValue() {
        model.incrementCounter()
        view.updateView()
    }

    override fun getCounter(): String {
        return model.getCounter().toString()
    }
}