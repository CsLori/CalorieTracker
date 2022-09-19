package com.example.tracker_data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tracker_data.local.entity.TrackedFoodEntity
import com.example.tracker_data.local.entity.TrackerDao

@Database(
    entities = [TrackedFoodEntity::class],
    version = 1,
    exportSchema = false
)
abstract class TrackerDatabase : RoomDatabase() {

    abstract val dao: TrackerDao

    companion object {
        const val TRACKER_DB = "tracker_db"
    }
}