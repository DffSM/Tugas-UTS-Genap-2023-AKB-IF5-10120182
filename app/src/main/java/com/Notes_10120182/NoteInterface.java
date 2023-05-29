package com.Notes_10120182;

import android.database.Cursor;

import com.Notes_10120182.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}

