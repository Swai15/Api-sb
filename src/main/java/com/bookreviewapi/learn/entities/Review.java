package com.bookreviewapi.learn.entities;

import jakarta.persistence.*;

@Entity
public class Review {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String reviewText;
  private int rating;

  @ManyToOne
  @JoinColumn(name = "book_id", nullable = false)
  private Book book;


  public Review() {
  }

  public Review(Long id, String reviewText, int rating){
    this.id = id;
    this.reviewText = reviewText;
    this.rating = rating;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public Long getId() {
    return id;
  }

  public String getReviewText() {
    return reviewText;
  }

  public void setReviewText(String reviewText) {
    this.reviewText = reviewText;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }
}
