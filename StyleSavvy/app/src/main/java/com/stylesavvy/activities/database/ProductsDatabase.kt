package com.stylesavvy.activities.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.stylesavvy.activities.dao.ProductsDao
import com.stylesavvy.activities.*


//@Database(entities = [Products::class,CategoryFragment::class,Category::class,Cosmetics::class,CosmeticsItems::class],version = 1,exportSchema = false)
//@TypeConverters(CategoryListConverter::class,CosmeticsListConverter::class)
abstract class ProductsDatabase: RoomDatabase() {

    companion object{

        var productsDatabase:ProductsDatabase? = null

        @Synchronized
        fun getDatabase(context: Context): ProductsDatabase{
            if (productsDatabase == null){
                productsDatabase = Room.databaseBuilder(
                    context,
                    ProductsDatabase::class.java,
                    "products.db"
                ).build()
            }
            return productsDatabase!!
        }
    }

    abstract fun productsDao():ProductsDao
}