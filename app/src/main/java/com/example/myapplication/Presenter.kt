package com.example.myapplication

class Presenter {
    private var model = CounterModel()
    private lateinit var view: CounterView

    fun incriment() {
        model.inc()
        view.showCount(model.ageCount)
        checkAndNotify()
    }

    fun decrement() {
        model.dec()
        view.showCount(model.ageCount)
        checkAndNotify()
    }

    fun attachView(view: CounterView) {
        this.view = view
    }

    private fun checkAndNotify() {
        val count = model.ageCount
        if (count >= 20) {
            view.changeTextColorToGreen()
        } else {
            view.resetTextColor()
        }
        if (count == 10) {
            view.showNotification()
        }
    }
}
