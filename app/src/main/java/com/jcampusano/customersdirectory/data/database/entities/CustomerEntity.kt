package com.jcampusano.customersdirectory.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "customers")
data class CustomerEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") var id: Int = 0,
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "rnc") var rnc: String,
    @ColumnInfo(name = "phone") var phone: String,
    @ColumnInfo(name = "businessId") var businessId: Int,
    @ColumnInfo(name = "address") var address: Map<Int, String>?
)