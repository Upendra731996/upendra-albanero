package com.example.ProjectFive.Service;

import com.example.ProjectFive.Model.BookModel;
import com.example.ProjectFive.Repository.BookRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepositroy bookRepositroy;
    public String Create(BookModel bookModel) {
        bookRepositroy.save(bookModel);
        return "this book has been written by upendra.";
    }
    public List<BookModel> getBook(){
        return bookRepositroy.findAll();
    }

    public BookModel bookUpdate(int BookId,BookModel bookModel){
      BookModel book=  bookRepositroy.findByBookId(BookId).get();
      bookModel.setBookId(book.getBookId());
      bookRepositroy.save(bookModel);
      return bookModel;
    }
    public void DeleteBook(String id){
        BookModel book= bookRepositroy.findById(id).get();
         bookRepositroy.delete(book);


    }

}
