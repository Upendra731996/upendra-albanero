package com.example.demo.Repository;

import com.example.demo.Model.NoteModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface NotesRepository extends MongoRepository<NoteModel,String> {
    Optional<NoteModel> findByid(String id);
}
