package ru.concepts.domain.table_module

import javax.sql.RowSet

class MortgageModule(override val ds: DataSet) : TableModule(ds, "MORTGAGE") {
}