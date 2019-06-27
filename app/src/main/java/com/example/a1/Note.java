package com.example.a1;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName =  "note_table")
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;
    private String descrition;
    private int priority;

    public Note(String title, String descrition, int priority) {
        this.title = title;
        this.descrition = descrition;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescrition() {
        return descrition;
    }

    public int getPriority() {
        return priority;
    }
}
