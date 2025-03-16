package com.reviews.review.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "reviews")
public class Review {

    @Id
    private String id;
    private String userId;
    private String content;
    private LocalDateTime createdAt;

    public Review() {}

    public Review(String userId, String content, LocalDateTime createdAt) {
        this.userId = userId;
        this.content = content;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}

