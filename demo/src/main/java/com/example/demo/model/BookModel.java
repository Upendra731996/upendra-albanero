package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "bookCollection")
@Data
public class BookModel {
    private String id;
    private   String bookTile;
    private   String AuthorName;
    private   String BookBody;

    public BookModel(String id, String bookTile, String authorName, String bookBody) {
        this.id = id;
        this.bookTile = bookTile;
        AuthorName = authorName;
        BookBody = bookBody;
    }

    public BookModel() {

    }


}