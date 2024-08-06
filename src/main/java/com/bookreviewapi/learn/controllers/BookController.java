package com.bookreviewapi.learn.controllers;

import com.bookreviewapi.learn.entities.Book;
import com.bookreviewapi.learn.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

  private final BookService bookService;

  public BookController(BookService bookService){
    this.bookService = bookService;
    }

  @GetMapping
  public List<Book> getAllBooks() {
    return bookService.findAllBooks();
  }


}
