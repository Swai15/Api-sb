package com.bookreviewapi.learn.repositories;

import com.bookreviewapi.learn.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
