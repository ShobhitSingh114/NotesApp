package com.example.notesapp.feature_note.domain.use_case

// It is a wrapper class
data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNotes: DeleteNotes
)