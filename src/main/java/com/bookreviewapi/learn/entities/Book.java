package com.bookreviewapi.learn.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String author;
  private String genre;
  private Integer publicationYear;

  @OneToMany(mappedBy = "book")
  @JsonManagedReference
  private List<Review> reviews;

  public Book() {
  }

  public Book(Long id, String title, String author, String genre, Integer publicationYear) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.publicationYear = publicationYear;
  }

  public List<Review> getReviews(){
    return reviews;
  }

  public void setReviews(List<Review> reviews) {
    this.reviews = reviews;
  }

  public Long getId() {
    return id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getPublicationYear() {
    return publicationYear;
  }

  public void setPublicationYear(int publicationYear) {
    this.publicationYear = publicationYear;
  }
}
