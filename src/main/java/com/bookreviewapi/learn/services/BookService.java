package com.bookreviewapi.learn.services;

import com.bookreviewapi.learn.entities.Book;
import com.bookreviewapi.learn.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public List<Book> findAllBooks() {
    return bookRepository.findAll();
  }

  public Book saveBook(Book book){
    return bookRepository.save(book);
  }



}
