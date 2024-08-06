package com.bookreviewapi.learn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Review {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long bookId;
  private String reviewText;
  private int rating;

  public Review() {
  }

  public Review(Long id, Long bookId, String reviewText, int rating){
    this.id = id;
    this.bookId = bookId;
    this.reviewText = reviewText;
    this.rating = rating;
  }

  public Long getId() {
    return id;
  }

  public Long getBookId () {
    return bookId;
  }

  public void setBookId(Long bookId) {
    this.bookId = bookId;
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
