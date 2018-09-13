package ru.concepts.domain.table_module

import javax.sql.RowSet

class ManagerModule(override val ds: DataSet) : TableModule(ds, "Manager") {

    fun calcIncome() {
        var result = 0L;
        for (rs in table.getRowSets {
            result += rs.getLong("income")
        }
    }


    fun calcLoss() {
        var result = 0L;
        for (rs in table.getRowSets {
            result += rs.getLong("loss")
        }
    }
}