package ru.concepts.domain.transaction_scenario

class ManagerLossService(val id: Long) : TractionScenario {

    val findMAnagerMortgages = "Select Income from Manager where id=?"
    var result : Long()

    override fun run() {
        val dao = DAO()
        val resultSet = dao.execute(findMAnagerMortgages)
        for(i in resultSet){
            result+=i.getLong("LOSS")
        }
    }
    
}