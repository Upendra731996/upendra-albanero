package com.example.ProjectFive.Service;

import com.example.ProjectFive.Model.BookModel;
import com.example.ProjectFive.Repository.BookRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private  BookRepositroy bookRepositroy;
    public  BookModel create(BookModel bookModel) {

        return bookRepositroy.save(bookModel);



    }
    public List<BookModel> getBook(){
        return bookRepositroy.findAll();
    }

    public BookModel bookUpdate(String id,BookModel bookModel){
      BookModel book=  bookRepositroy.findById(id).get();
      bookModel.setId(book.getId());
      bookRepositroy.save(bookModel);
      return bookModel;
    }
    public BookModel deleteBook(String id){
        BookModel book= bookRepositroy.findById(id).get();
         bookRepositroy.delete(book);
return null;

    }

}
