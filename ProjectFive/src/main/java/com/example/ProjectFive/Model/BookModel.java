package com.example.ProjectFive.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data

public class BookModel {
    String id;
    int bookId;
    String bookName;
    String bookTile;
    String bookAuthor;
    String bookBody;

    public BookModel( String bookName, String bookBody,String bookAuthor,
                      String bookTile,String id, int bookId) {
        this.bookName=bookName;
        this.bookBody=bookBody;
        this.bookAuthor=bookAuthor;
        this.bookTile=bookTile;
        this.bookId=bookId;
        this.id=id;
    }

    public BookModel() {
    }
}
