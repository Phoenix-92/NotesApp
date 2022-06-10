package com.example.notes.Repository

import androidx.lifecycle.LiveData
import com.example.notes.Dao.NotesDao
import com.example.notes.Entity.Notes


class NotesRepository(val dao: NotesDao) {

    fun getAllNotes(): LiveData<List<Notes>> {
        return dao.getNotes()
    }

    fun insertNotes(notes: Notes){
        dao.insertNotes(notes)
    }

    fun deleteNotes(id: Int){
        dao.deleteNotes(id)
    }

    fun updateNotes(notes: Notes){
        dao.updateNotes(notes)
    }

}