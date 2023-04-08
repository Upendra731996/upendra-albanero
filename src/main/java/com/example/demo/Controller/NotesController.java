package com.example.demo.Controller;
import java.util.*;
import com.example.demo.Model.NoteModel;
import com.example.demo.Service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.util.Optional;

@RestController
public class NotesController {
    @Autowired
    private NotesService notesService;
    @PostMapping("/postNote")
    public ResponseEntity<NoteModel> craeteNote(@RequestBody NoteModel noteModel){
        if (noteModel==null){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        else {
            NoteModel note= notesService.create(noteModel);
            return new ResponseEntity<>(note,HttpStatus.CREATED);
        }
    }
    @GetMapping("/getNote/{id}")

    public ResponseEntity<NoteModel> getNoteByid(@PathVariable String id){
        if (id==null){
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);

        }
        else {
            Optional<NoteModel> note=notesService.fetchNote(id);
                    return new ResponseEntity<>(note.get(),HttpStatus.ACCEPTED);
        }

    }

    @GetMapping("/getAllNote")
    public ResponseEntity<List<NoteModel>> getAll(){
        List<NoteModel> list=notesService.getAllNote();
        if (list==null){
          return new ResponseEntity(null,HttpStatus.BAD_REQUEST);

        }
        else {
            return new ResponseEntity<>(list,HttpStatus.ACCEPTED);
        }

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<NoteModel> updateNote(@RequestBody NoteModel noteModel,@PathVariable String id){

        if (noteModel==null||id==null){
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
        else {
            NoteModel note= notesService.update(noteModel,id);
            return new ResponseEntity<>(note,HttpStatus.ACCEPTED);
        }
    }
    @DeleteMapping("/deleteNote/{id}")
    public ResponseEntity<String> NoteDeleted(@PathVariable String id){
        if (id==null){
            return new ResponseEntity<>("please give id",HttpStatus.BAD_REQUEST);
        }
        else {
            notesService.deleteNote(id);
            return new ResponseEntity<>("successfully deteted",HttpStatus.ACCEPTED);
        }

    }
}
