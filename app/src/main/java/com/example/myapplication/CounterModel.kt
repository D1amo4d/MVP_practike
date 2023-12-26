package com.example.myapplication

import android.widget.Toast

class CounterModel {
    var ageCount = 0

    fun inc() {
        ageCount++
    }

    fun dec() {
        ageCount--
    }

    fun messageToast(textToast: String) {
    }
}
