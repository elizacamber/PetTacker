package dev.elizacamber.pettracker.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase


@Database(entities = [Pet::class], version = 1)
@TypeConverters(dev.elizacamber.pettracker.data.TypeConverters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun petDao(): PetDao

    companion object {

        // For Singleton instantiation
        @Volatile private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context.applicationContext,
                AppDatabase::class.java, "PetTracker.db")
                .fallbackToDestructiveMigration()
                .build()
        }
    }
}