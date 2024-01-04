package com.bookManagement.author.book.Management.System.controller;

import com.bookManagement.author.book.Management.System.models.Author;
import com.bookManagement.author.book.Management.System.models.Book;
import com.bookManagement.author.book.Management.System.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
//    Create an author and book management system which can help us easily to perform CRUD
//    operations.POST
// :Add book(been there), add author
    @Autowired
BookService service;

    @PostMapping("/add-author")
    public ResponseEntity<String> addAuthor(@RequestBody Author author, @RequestParam String bookName){
        service.addAuthor(author,bookName);
        return new ResponseEntity<>("Author added successfully", HttpStatus.CREATED);
    }
    @PostMapping("/add-book")
    public ResponseEntity<String> addBook(@RequestBody Book book){
        service.addBook(book);
        return new ResponseEntity<>("Book added successfully",HttpStatus.CREATED);
    }
}
