package com.bookreviewapi.learn.repositories;

import com.bookreviewapi.learn.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
