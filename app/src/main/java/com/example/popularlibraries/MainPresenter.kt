package com.example.popularlibraries

class MainPresenter(private val view: MainView, private val model: CountersModel) {

    fun counterClick(btnCounterNumber: BtnCounterNumber) {
        when (btnCounterNumber) {
            BtnCounterNumber.ONE -> {
                val nextValue = model.next(btnCounterNumber.number)
                view.setButton1Text("$nextValue")
            }
            BtnCounterNumber.TWO -> {
                val nextValue = model.next(btnCounterNumber.number)
                view.setButton2Text("$nextValue")
            }
            BtnCounterNumber.THREE -> {
                val nextValue = model.next(btnCounterNumber.number)
                view.setButton3Text("$nextValue")
            }
        }
    }
}