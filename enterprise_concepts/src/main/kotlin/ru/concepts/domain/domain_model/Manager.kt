package ru.concepts.domain.domain_model

class Manager(val id: Long?, val mortgages: List<Mortgage>?) {


    fun calcIncome() {
        var res = 0L
        if (mortgages != null) {
            for (mortgage in mortgages) {
                res += mortgage.calcIncome()
            }
        }
    }
}