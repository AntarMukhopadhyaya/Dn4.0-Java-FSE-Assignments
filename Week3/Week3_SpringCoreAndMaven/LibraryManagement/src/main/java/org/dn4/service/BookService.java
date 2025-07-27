package org.dn4.service;

import org.dn4.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    // Setter-based dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook(String bookName) {
        if (bookRepository != null) {
            System.out.println(bookName + " book added");
            bookRepository.saveBook(bookName);
        } else {
            System.out.println("BookRepository is not set.");
        }
    }
}
