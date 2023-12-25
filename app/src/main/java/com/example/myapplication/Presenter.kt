package com.example.myapplication

class Presenter {
    private var model = CounterModel()
    private lateinit var view: CounterView

    fun increment() {
        model.inc()
        view.showCount(model.count)
    }

    fun decrement() {
        model.dec()
        view.showCount(model.count)
    }


    fun attachView(view: CounterView) {
        this.view = view
    }


}