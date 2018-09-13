package ru.concepts.domain.table_module

import groovy.sql.DataSet
import javax.sql.RowSet

open class TableModule() {

    open var rs: DataSet = DataSet()
    var tableName: String = ""
    var table: DataTable

    constructor(ds: DataSet, tableName: String) : this() {
        table = ds.getTable(tableName)
    }
}