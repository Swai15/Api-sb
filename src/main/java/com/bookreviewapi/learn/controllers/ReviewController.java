package com.bookreviewapi.learn.controllers;

import com.bookreviewapi.learn.entities.Review;
import com.bookreviewapi.learn.services.ReviewService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

  private final ReviewService reviewService;

  public ReviewController(ReviewService reviewService) {
    this.reviewService = reviewService;
  }

  public List<Review> findAllReviews() {
    return reviewService.findAllReviews();
  }


}
