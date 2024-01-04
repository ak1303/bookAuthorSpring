package com.bookManagement.author.book.Management.System.service;

import com.bookManagement.author.book.Management.System.models.Author;
import com.bookManagement.author.book.Management.System.models.Book;
import com.bookManagement.author.book.Management.System.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository repository;
    public void addAuthor(Author author,String bookName){
        repository.addAuthor(author,bookName);
    }
    public void addBook(Book book){
        repository.addBook(book);
    }

}
