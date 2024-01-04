package com.bookManagement.author.book.Management.System.repository;

import com.bookManagement.author.book.Management.System.models.Author;
import com.bookManagement.author.book.Management.System.models.Book;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookRepository {

    Set<Book> books;
    Set<Author> authors;
    Map<Author, List<Book>> authorBookMap;
    BookRepository(){
        books = new HashSet<>();
        authors = new HashSet<>();
        authorBookMap = new HashMap<>();
    }
    public void addAuthor(Author author, String bookName){
        for(Author auth : authors){
            if(auth.getName().equals(author.getName()))
                return;
        }
        Book book = null;
        for(Book book1 : books){
            if(book1.getName().equals(bookName)) {
                book =book1;
                break;
            }
        }
        authorBookMap.get(author).add(book);
        authors.add(author);
    }
    public void addBook(Book book){
        for(Book book1 : books){
            if(book1.getName().equals(book.getName()))
                return;
        }
        books.add(book);
    }
}
