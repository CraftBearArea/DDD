package ru.concepts.domain.transaction_scenario

class CreateMortgageService(val managerId: Long, val morgageIncome: Long) : TractionScenario {

    val createMortgage = "Insert values(?,?) into mortgages"

    override fun run() {
        val dao = DAO()
        dao.execute(createMortgage, morgageIncome, managerId)
    }
}