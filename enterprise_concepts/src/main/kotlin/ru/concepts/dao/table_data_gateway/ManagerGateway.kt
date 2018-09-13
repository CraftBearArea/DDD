package ru.concepts.dao.table_data_gateway

import javax.sql.DataSource
import javax.sql.RowSet

class ManagerGateway(val dataSource: DataSource) {

    val findSql = "select * from MANAGER"

    fun find(id: Long): RowSet {
        dataSource.execute(findSql, id)
    }

    fun findAll(): List<RowSet> {

    }

    fun insert(rs: RowSet) {

    }


    fun update(rs: RowSet) {

    }

    fun delete(id) {

    }


}