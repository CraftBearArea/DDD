package ru.concepts.dao.data_mapper

import javax.sql.DataSource
import javax.sql.RowSet

class ManagerMapper(val dataSource :DataSource) {

    var findSql = "Select * From ..."

    fun find(id:Long):Manager{
        var rs = dataSource.execute(findSql, id)
        //переводим rs в Manager
        var result = Manager()
        result.name = rs.getString("Name")
    }

    fun update(rs: RowSet) {

    }

    fun delete(id) {

    }

}