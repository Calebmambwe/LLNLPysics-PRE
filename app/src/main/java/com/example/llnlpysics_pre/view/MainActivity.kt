package com.example.llnlpysics_pre.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.llnlpysics_pre.R
import com.example.llnlpysics_pre.`interface`.Pinterface
import com.example.llnlpysics_pre.presenter.MainActivityPresenter

class MainActivity(override var result: Any) : AppCompatActivity(), Pinterface.DataView{
    private var presenter: MainActivityPresenter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter=MainActivityPresenter(this)
    }

    override fun initView() {
//        result.text =presenter?.getCounter()
//        btn.setOnClickListener{presenter?.increamentValue()}
    }

    override fun updateView() {
//        result.text=presenter?.getCounter()
    }

}