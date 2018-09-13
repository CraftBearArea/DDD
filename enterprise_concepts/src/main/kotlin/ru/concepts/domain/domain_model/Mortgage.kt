package ru.concepts.domain.domain_model

class Mortgage(val income: Long, val loss: Long) {
    fun calcIncome(): Long {
        return income - loss
    }
}