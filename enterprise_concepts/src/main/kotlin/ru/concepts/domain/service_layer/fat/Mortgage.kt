package ru.concepts.domain.service_layer.fat

class Mortgage(val income: Long, val loss: Long) {
    fun calcIncome(): Long {
        return income - loss
    }
}