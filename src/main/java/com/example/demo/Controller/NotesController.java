package com.example.demo.Controller;
import java.util.*;
import com.example.demo.Model.NoteModel;
import com.example.demo.Service.NotesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.util.Optional;

@RestController
public class NotesController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private NotesService notesService;
    @PostMapping("/postNote")
    public ResponseEntity<NoteModel> craeteNote(@RequestBody NoteModel noteModel){
        if (noteModel==null){
            logger.info("please privide data to create note");
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        else {
            NoteModel note= notesService.create(noteModel);
            logger.info("note success fully update");
            return new ResponseEntity<>(note,HttpStatus.CREATED);
        }
    }
    @GetMapping("/getNote/{id}")

    public ResponseEntity<NoteModel> getNoteByid(@PathVariable String id){
        if (id==null){
            logger.info("note id missing for fetchNote");
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);

        }
        else {

            Optional<NoteModel> note=notesService.fetchNote(id);
            logger.info("note success fully fetch woth help of id ");
                    return new ResponseEntity<>(note.get(),HttpStatus.ACCEPTED);
        }

    }

    @GetMapping("/getAllNote")
    public ResponseEntity<List<NoteModel>> getAll(){
        List<NoteModel> list=notesService.getAllNote();
        if (list==null){
            logger.info("note ar not created");
          return new ResponseEntity(null,HttpStatus.BAD_REQUEST);

        }
        else {
            logger.info(" all note success fully retrive ");
            return new ResponseEntity<>(list,HttpStatus.ACCEPTED);
        }

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<NoteModel> updateNote(@RequestBody NoteModel noteModel,@PathVariable String id){

        if (noteModel==null||id==null){
            logger.info("for updaing note details or id is missing");
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
        else {
            NoteModel note= notesService.update(noteModel,id);
            logger.info("success fully update note");
            return new ResponseEntity<>(note,HttpStatus.ACCEPTED);
        }
    }
    @DeleteMapping("/deleteNote/{id}")
    public ResponseEntity<String> NoteDeleted(@PathVariable String id){
        if (id==null){
            logger.info("not id is missing for delete");
            return new ResponseEntity<>("please give id",HttpStatus.BAD_REQUEST);
        }
        else {
            notesService.deleteNote(id);
            logger.info("note deleted success fully with help of id");
            return new ResponseEntity<>("successfully deteted",HttpStatus.ACCEPTED);
        }

    }
}
