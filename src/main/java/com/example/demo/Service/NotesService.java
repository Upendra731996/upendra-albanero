package com.example.demo.Service;

import com.example.demo.Model.NoteModel;
import com.example.demo.Repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotesService {

@Autowired
    private NotesRepository notesRepository;
public NoteModel create(NoteModel noteModel){
    return notesRepository.save(noteModel);
}
public Optional<NoteModel> fetchNote(String id){
    Optional<NoteModel> not= Optional.of(notesRepository.findByid(id).get());
    return not;

}
public List<NoteModel> getAllNote(){
    return notesRepository.findAll();
}

public NoteModel update(NoteModel noteModel,String id){
    Optional<NoteModel> not= Optional.of(notesRepository.findByid(id).get());
    noteModel.setId(not.get().getId());
    return notesRepository.save(noteModel);

}
public String deleteNote(String id){
    NoteModel not= notesRepository.findByid(id).get();

     notesRepository.delete(not);
    return"success";

}
}
