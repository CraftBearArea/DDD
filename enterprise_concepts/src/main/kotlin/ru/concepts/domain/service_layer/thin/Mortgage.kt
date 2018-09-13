package ru.concepts.domain.service_layer.thin

class Mortgage(val income: Long, val loss: Long) {
    fun calcIncome(): Long {
        return income - loss
    }
}