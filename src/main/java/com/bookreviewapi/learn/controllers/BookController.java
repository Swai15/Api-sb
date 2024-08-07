package com.bookreviewapi.learn.controllers;

import com.bookreviewapi.learn.entities.Book;
import com.bookreviewapi.learn.services.BookService;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping
  public Book saveBook(@RequestBody Book book) {
    return bookService.saveBook(book);
  }


}
