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

}
