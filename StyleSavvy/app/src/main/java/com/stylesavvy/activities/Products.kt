package com.stylesavvy.activities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Products")
data class Products(
    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @ColumnInfo(name = "cosmeticName")
    var cosmeticName:String
) : Serializable