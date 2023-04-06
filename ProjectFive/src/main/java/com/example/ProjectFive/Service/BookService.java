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
        if(bookModel==null){
            System.out.println("can't found book model");
            return null;
        }

         BookModel bookModel1=bookRepositroy.save(bookModel);
        return bookModel1;



    }
    public List<BookModel> getBook(){
        List<BookModel> list =bookRepositroy.findAll();
        if(list.size()>0){
            return list ;
        }
        else {
            return null;
        }
    }

    public BookModel bookUpdate(String id,BookModel bookModel){
      BookModel book=  bookRepositroy.findById(id).get();

      bookModel.setId(book.getId());
     return  bookRepositroy.save(bookModel);

    }
    public BookModel deleteBook(String id){
        BookModel book= bookRepositroy.findById(id).get();
         bookRepositroy.delete(book);
return null;

    }

}
