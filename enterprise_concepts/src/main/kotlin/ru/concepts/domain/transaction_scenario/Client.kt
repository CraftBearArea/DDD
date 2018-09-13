package ru.concepts.domain.transaction_scenario

class Client {



    fun click(){
        val command = ManagerIncomeService(123)
        command.run()
    }
}