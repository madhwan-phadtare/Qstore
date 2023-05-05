package com.quantiphi.Qstore.services;

import com.quantiphi.Qstore.config.ApplicationConfig;
import com.quantiphi.Qstore.entities.Product;
import com.quantiphi.Qstore.entities.Review;
import com.quantiphi.Qstore.repositories.ProductRepository;
import com.quantiphi.Qstore.repositories.ReviewRepository;

public class ReviewService {
    ReviewRepository reviewRepository = ApplicationConfig.reviewRepository;
    ProductRepository productRepository = ApplicationConfig.productRepository;

    public String addReview(Review review){
        return reviewRepository.save(review);
    }
    public Review getReview(String reviewId){
        return reviewRepository.findById(reviewId);
    }


}
