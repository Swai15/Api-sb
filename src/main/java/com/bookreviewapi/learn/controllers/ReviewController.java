package com.bookreviewapi.learn.controllers;

import com.bookreviewapi.learn.entities.Review;
import com.bookreviewapi.learn.services.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

  private final ReviewService reviewService;

  public ReviewController(ReviewService reviewService) {
    this.reviewService = reviewService;
  }

  @GetMapping
  public List<Review> findAllReviews() {
    return reviewService.findAllReviews();
  }

  @PostMapping
  public Review saveReview(@RequestBody Review review){
    return reviewService.saveReview(review);
  }


}
