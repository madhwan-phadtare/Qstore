package com.quantiphi.Qstore.repositories;

import com.quantiphi.Qstore.entities.Review;

import java.util.List;

public interface ReviewRepository {
    public String save(Review review);
    public Review findById(String reviewId);

}
