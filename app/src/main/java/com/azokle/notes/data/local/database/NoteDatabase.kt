package com.azokle.notes.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.azokle.notes.core.constant.DatabaseConst
import com.azokle.notes.data.local.dao.NoteDao
import com.azokle.notes.domain.model.Note

@Database(
    entities = [Note::class],
    version = DatabaseConst.NOTES_DATABASE_VERSION,
    exportSchema = false
)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao
}