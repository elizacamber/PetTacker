package dev.elizacamber.pettracker.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PetDao {

    @Query("SELECT * FROM pet")
    fun getAll(): List<Pet>

    @Insert
    fun insertAll(vararg pets: Pet)

    @Delete
    fun delete(pet: Pet)
}