package ru.concepts.dao.row_data_gateway

import javax.sql.DataSource
import javax.sql.RowSet

class ManagerFinder(val dataSource: DataSource) {

    val findSql = "select * from MANAGER"

    fun find(id: Long): RowSet {
        dataSource.execute(findSql, id)
    }

    fun findAll(): List<RowSet> {

    }

}