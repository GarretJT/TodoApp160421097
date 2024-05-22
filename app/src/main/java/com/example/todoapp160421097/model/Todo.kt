package com.example.todoapp160421097.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    @ColumnInfo(name="title")
    var title:String,
    @ColumnInfo(name="notes")
    var notes:String,
    @ColumnInfo(name="priority")
    var priority:Int,
    @ColumnInfo(name = "is_done", defaultValue = "0")
    var isDone:Int = 0, // Because the database system doesn't support Boolean data type
) {
    @PrimaryKey(autoGenerate = true)
    var uuid:Int =0
}
