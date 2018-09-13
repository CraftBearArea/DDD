package ru.concepts.domain.service_layer.fat

import ru.concepts.domain.domain_model.Manager

class ManagerService {

    fun calcIncome(manager: Manager) {
        var res = 0L
        val mortgages = manager.mortgages
        if (mortgages != null) {
            for (mortgage in mortgages) {
                res += mortgage.calcIncome()
            }
        }
    }
}