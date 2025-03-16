package com.reviews.review.service;

import com.reviews.review.model.Review;
import com.reviews.review.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    // Save a new review
    public Review saveReview(String userId, String content) {
        Review review = new Review(userId, content, LocalDateTime.now());
        return reviewRepository.save(review);
    }

    // Get all reviews sorted by createdAt
    public List<Review> getAllReviews() {
        return reviewRepository.findAllByOrderByCreatedAtDesc();
    }
}
