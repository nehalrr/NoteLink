package com.example.notelink.listeners;

import com.example.notelink.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
