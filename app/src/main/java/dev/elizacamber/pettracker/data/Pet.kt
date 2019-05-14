package dev.elizacamber.pettracker.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "pet")
data class Pet (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo
    var name: String,
    @ColumnInfo
    var dob: Date,
    @ColumnInfo
    var lastHeartPill: Date,        /* the date the last pill for the heart worms was given */
    @ColumnInfo
    var nextHeartPeal: Date,        /* the date the pet should get the next pill for the heart worms, calculated after the user inputs the duration of the previous pill effect */
    @ColumnInfo
    var lastTickTreatment: Date,    /* the date the last treatment for the ticks and other insects was given */
    @ColumnInfo
    var nextTickTreatment: Date     /* the date the pet should get the next treatment for the ticks, calculated after the user inputs the duration of the previous treatment effect */
)