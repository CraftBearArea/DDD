package ru.concepts.domain.service_layer.thin

import ru.concepts.domain.domain_model.Manager

class ManagerService {

    fun calcIncome(manager: Manager) {
        return manager.calcIncome()
    }
}