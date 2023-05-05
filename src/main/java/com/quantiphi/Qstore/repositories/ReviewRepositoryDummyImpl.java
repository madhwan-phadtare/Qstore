package com.quantiphi.Qstore.repositories;

import com.quantiphi.Qstore.config.ApplicationConfig;
import com.quantiphi.Qstore.entities.Product;
import com.quantiphi.Qstore.entities.Review;

import java.util.HashMap;

public class ReviewRepositoryDummyImpl implements ReviewRepository{
    HashMap<String, Review> reviewMap = new HashMap<>();
    String autoIncrement = "1";

    @Override
    public String save(Review review){
        ProductRepository productRepository = ApplicationConfig.productRepository;

        review.setReviewId(autoIncrement);
        String reviewId = review.getReviewId();
        String productId = review.getProductId();
        reviewMap.put(reviewId, review);

        Product product = productRepository.findProductByProductId(productId);
        String status = product.addReview(reviewId);
        return status;
    }

    public Review findById(String reviewId){
        return reviewMap.get(reviewId);
    }

}
