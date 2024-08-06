package com.bookreviewapi.learn.services;

import com.bookreviewapi.learn.entities.Review;
import com.bookreviewapi.learn.repositories.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

  public final ReviewRepository reviewRepository;

  public ReviewService(ReviewRepository reviewRepository) {
    this.reviewRepository = reviewRepository;
  }

  public List<Review> findAllReviews() {
    return reviewRepository.findAll();
  }

}
