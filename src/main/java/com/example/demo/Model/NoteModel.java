package com.example.demo.Model;

import lombok.Data;

@Data
public class NoteModel {
    private String id;
    private String username;
    private String title;
    private String body;

    public NoteModel(String id, String username, String title, String body) {
        this.id = id;
        this.username = username;
        this.title = title;
        this.body = body;
    }
}
