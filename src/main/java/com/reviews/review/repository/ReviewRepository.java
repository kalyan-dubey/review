package com.reviews.review.repository;

import com.reviews.review.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends MongoRepository<Review, String> {
    List<Review> findAllByOrderByCreatedAtDesc(); // Sort by createdAt DESC
}
